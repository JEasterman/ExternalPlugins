/*
 * Copyright (c) 2018, DennisDeV <https://github.com/DevDennis>
 * Copyright (c) 2019-2020, ganom <https://github.com/Ganom>
 * Copyright (c) 2021, JEasterman <https://github.com/JEasterman>
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


import java.util.Optional;

import net.runelite.api.ItemID;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.plugins.externals.utils.ExtUtils;

public class Potion
{
	private final int[] overloadPotions = {ItemID.OVERLOAD_1, ItemID.OVERLOAD_2, ItemID.OVERLOAD_3, ItemID.OVERLOAD_4};
	// private final int[] overloadPotions = {ItemID.SUPER_ATTACK1, ItemID.SUPER_ATTACK2, ItemID.SUPER_ATTACK3, ItemID.SUPER_ATTACK4};

	public void sip(ExtUtils extUtils)
	{
		Optional<WidgetItem> potionToSip = this.getNextPotionWidget(extUtils);
		if (potionToSip.isPresent())
		{
			extUtils.click(potionToSip.get().getCanvasBounds());
		}
	}

	private Optional<WidgetItem> getNextPotionWidget(ExtUtils extUtils)
	{
		return extUtils.getItems(overloadPotions).stream().findFirst();
	}
}
