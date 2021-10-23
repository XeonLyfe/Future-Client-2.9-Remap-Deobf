package net.futureclient.client;

import net.futureclient.client.GA;
import net.futureclient.client.kH;
import net.futureclient.client.wC;

public class JE
extends GA {
    @Override
    public String f$E() {
        return "&e[number]";
    }

    @Override
    public String f$E(String[] object) {
        if (((String[])object).length == 1) {
            object = object[0];
            wC wC2 = (wC)kH.f$E().f$E().f$E(wC.class);
            if (object == null) {
                return "No number entered.";
            }
            if (wC2 != null) {
                wC wC3 = wC2;
                wC3.f$g.f$E(Double.parseDouble((String)object));
                wC3.f$d.f$E(Double.parseDouble((String)object));
            }
            return new StringBuilder().insert(0, "Horizontal and vertical percentage has been set to ").append(Double.parseDouble((String)object)).toString();
        }
        return null;
    }

    public JE() {
        JE jE;
        String[] stringArray = new String[8];
        stringArray[0] = "VelocityPercentage";
        stringArray[1] = "velocity%";
        stringArray[2] = "%";
        stringArray[3] = "Vel";
        stringArray[4] = "Velocity_reduction";
        stringArray[5] = "Reduce";
        stringArray[6] = "Reduction";
        stringArray[7] = "Lower";
        super(stringArray);
    }
}
package net.futureclient.client;

import java.util.stream.Stream;

public final class Je
extends Enum<Je> {
    public static final Je f$e;
    private static final Je[] f$d;
    public static final Je f$i;
    public static final Je f$b;
    public static final Je f$C;
    private final String f$M;
    public static final Je f$I;
    public static final Je f$K;
    public static final Je f$j;
    public static final Je f$a;
    private final String f$g;

    public static Je valueOf(String string) {
        return Enum.valueOf(Je.class, string);
    }

    public static Je f$E(String string) {
        return Stream.of(Je.values()).filter(je -> {
            if (je.f$E() != null && je.f$E().equals(string)) {
                return true;
            }
            return false;
        }).findFirst().orElse(f$i);
    }

    public String f$a() {
        Je je;
        return je.f$M;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Je(String string) {
        je((String)var1_-1, (int)var2_-1, (String)0, null);
        void var2_-1;
        void var1_-1;
        Je je;
    }

    static {
        f$a = new Je("FUTURE_MIXIN_COMMON_CONFIG", 0, "mixins.future.common.json", "net.futureclient.loader.mixin.common");
        f$C = new Je("FUTURE_MIXIN_FORGE_CONFIG", 1, "mixins.future.forge.json", "net.futureclient.loader.mixin.forge");
        f$e = new Je("FUTURE_MIXIN_VANILLA_CONFIG", 2, "mixins.future.vanilla.json", "net.futureclient.loader.mixin.vanilla");
        f$I = new Je("FUTURE_MIXIN_OPTIFINE_CONFIG", 3, "mixins.future.optifine.json", "net.futureclient.loader.mixin.optifine");
        f$K = new Je("FUTURE_MIXIN_BARITONE_CONFIG", 4, "mixins.future.baritone.json", "net.futureclient.loader.mixin.baritone");
        f$b = new Je("BARITONE_MIXIN_CONFIG", 5, "mixins.baritone.json");
        f$j = new Je("CAPI_MIXIN_CONFIG", 6, "mixins.capi.json");
        f$i = new Je("UNKNOWN_CONFIG", 7, "unknown");
        Je[] jeArray = new Je[8];
        jeArray[0] = f$a;
        jeArray[1] = f$C;
        jeArray[2] = f$e;
        jeArray[3] = f$I;
        jeArray[4] = f$K;
        jeArray[5] = f$b;
        jeArray[6] = f$j;
        jeArray[7] = f$i;
        f$d = jeArray;
    }

    /*
     * WARNING - void declaration
     */
    private Je(String string2, String string2) {
        void var2_-1;
        void var1_-1;
        Je je;
        Je je2 = je;
        je2.f$M = 0;
        je2.f$g = 0;
    }

    public String f$E() {
        Je je;
        return je.f$g;
    }

    public static Je[] values() {
        return (Je[])f$d.clone();
    }
}
package net.futureclient.client;

import net.futureclient.client.RF;

public final class jE
extends RF {
    public jE() {
        jE jE2;
    }
}
