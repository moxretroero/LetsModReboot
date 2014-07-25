package com.moxretroero.sailcraft.item;

/**
 * A powerful ranged weapon that deals higher damage than a bow, but has more pricey ammo.  Flintlocks will
 * be made to fire several kinds of bullets, dealing heavy damage to the targets they hit along with other
 * special effects.
 */
public class ItemFlintlock extends ItemSC
{
    public ItemFlintlock()
    {
        super();
        this.setUnlocalizedName("flintlock");
        this.maxStackSize = 1;
    }
}
