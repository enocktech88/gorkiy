package com.askgps.personaltrackercore.extension;

import android.content.Context;
import com.askgps.personaltrackercore.utils.WifiUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/askgps/personaltrackercore/utils/WifiUtils;", "invoke"}, k = 3, mv = {1, 1, 16})
/* compiled from: ContextExtension.kt */
final class ContextExtensionKt$getMac$wifiUtils$2 extends Lambda implements Function0<WifiUtils> {
    final /* synthetic */ Context $this_getMac;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ContextExtensionKt$getMac$wifiUtils$2(Context context) {
        super(0);
        this.$this_getMac = context;
    }

    public final WifiUtils invoke() {
        return new WifiUtils(this.$this_getMac);
    }
}
