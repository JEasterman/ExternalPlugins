/*
 * Copyright (c) 2018, DennisDeV <https://github.com/DevDennis>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.externals.nightmarezone;

import java.awt.event.KeyEvent;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup("nightmarezone")
public interface NightmareZoneConfig extends Config
{
	@ConfigItem(
		keyName = "useMouse",
		name = "Use Mouse Button",
		description = "Uses mouse button instead of /",
		position = 1
	)
	default boolean useMouse()
	{
		return false;
	}

	@ConfigItem(
		keyName = "clearChat",
		name = "Clear Chat if using a keybind",
		description = "Clears Chat",
		position = 2
	)
	default boolean clearChat()
	{
		return false;
	}

	@ConfigItem(
		keyName = "hotkey2",
		name = "Flick hotkey",
		description = "When you press this key pray flicking will start",
		position = 3
	)
	default Keybind hotkey2()
	{
		return new Keybind(KeyEvent.VK_BACK_SLASH, 0);
	}

	@ConfigItem(
		keyName = "mouseButton",
		name = "Mouse Button",
		description = "Which mouse button should it work on, i.e 1,2,3,4,5",
		position = 4
	)
	default int mouseButton()
	{
		return 4;
	}

	@ConfigItem(
		keyName = "holdMode",
		name = "Hold Mode",
		description = "Hold down key/mouse instead of toggle",
		position = 5
	)
	default boolean holdMode()
	{
		return false;
	}

	@ConfigItem(
		keyName = "clicks",
		name = "Double Click Mode",
		description = "Enabled = Double Click, Disabled = Single Click",
		position = 6
	)
	default boolean clicks()
	{
		return true;
	}

	@ConfigItem(
		keyName = "display",
		name = "Draw Indicator",
		description = "Draws circle around prayer",
		position = 7
	)
	default boolean display()
	{
		return true;
	}

	@ConfigItem(
		keyName = "mouseEvents",
		name = "Use MouseEvents",
		description = "This is a risky setting to enable, only enable if you accept the risks.",
		position = 9
	)
	default boolean mouseEvents()
	{
		return false;
	}
}
