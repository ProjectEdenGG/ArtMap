package me.Fupery.ArtMap.Command;

import me.Fupery.ArtMap.ArtMap;
import me.Fupery.ArtMap.Config.Lang;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

abstract class AsyncCommand {

	protected final String usage;
	private final String permission;
	private final boolean consoleAllowed;

	AsyncCommand(String permission, String usage, boolean consoleAllowed) {
		this.permission = permission;
		this.consoleAllowed = consoleAllowed;

		if (usage == null) {
			throw new IllegalArgumentException("Usage must not be null");
		}
		this.usage = usage;
	}

	void runPlayerCommand(final CommandSender sender, final String args[]) {

		ArtMap.instance().getScheduler().ASYNC.run(() -> {
			ReturnMessage returnMsg = new ReturnMessage(sender, null);

			if (permission != null && !sender.hasPermission(permission)) {
				returnMsg.message = Lang.NO_PERM.get();

			} else if (!consoleAllowed && !(sender instanceof Player)) {
				returnMsg.message = Lang.NO_CONSOLE.get();

			} else {
				runCommand(sender, args, returnMsg);
			}

			if (returnMsg.message != null) {
				ArtMap.instance().getScheduler().SYNC.run(returnMsg);
			}
		});
	}

	public abstract void runCommand(CommandSender sender, String[] args, ReturnMessage msg);

}

