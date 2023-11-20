package dev.kafein.npcinteractions.objective.condition;

import dev.kafein.npcinteractions.compatibility.implementation.VaultCompatibility;
import org.bukkit.entity.Player;

public final class MoneyCondition implements Condition{
    private final double money;

    public MoneyCondition(double money) {
        this.money = money;
    }

    @Override
    public void apply(Player player) {
        VaultCompatibility.getEconomy().withdrawPlayer(player, this.money);
    }

    @Override
    public boolean test(Player player) {
        return VaultCompatibility.getEconomy().has(player, this.money);
    }
}
