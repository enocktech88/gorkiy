package com.askgps.personaltrackercore.ui.camera;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
/* compiled from: CameraFragmentPhone.kt */
final class CameraFragmentPhone$onActivityCreated$2 implements Runnable {
    final /* synthetic */ CameraFragmentPhone this$0;

    CameraFragmentPhone$onActivityCreated$2(CameraFragmentPhone cameraFragmentPhone) {
        this.this$0 = cameraFragmentPhone;
    }

    public final void run() {
        this.this$0.startCamera();
    }
}