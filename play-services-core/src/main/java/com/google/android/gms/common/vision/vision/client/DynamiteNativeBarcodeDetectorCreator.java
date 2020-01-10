package com.google.android.gms.common.vision.vision.client;

import android.os.IBinder;
import android.util.Log;

import com.google.android.gms.common.vision.IDynamiteNativeBarcodeDetectorCreator;

public class DynamiteNativeBarcodeDetectorCreator implements IDynamiteNativeBarcodeDetectorCreator {


    @Override
    public IBinder asBinder() {
        Log.d("barcoder", "This won't work....");
        return null;
    }
}
