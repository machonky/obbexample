# OBBExample

This is a functioning example on how to access the content of an Android OBB zip
file that contains a simple self contained website.

The example shows how derive your own Content Provider derived from the Android "APEZProvider" found 
in the "com.android.vending.expansion" package found in the Android SDK. 

This Content Provider is used to access the obb file and its contents via the "content://" protocol.

The key to successful operation with the new content provider is the declaration in the AndroidManifest.xml.
The provider element declares the fully qualified name of the content provider and the authorities attribute declares
exactly the same path as implemented in the derived provider.   

You'll have to manually install the obb file into your emulator or device. A pre-packaged and named obb file is provided
that was created using the "store" function with 7-Zip (don't compress) and using an obb file extension. The basic 
site and it's contents is also provided.

On your device or emulator, you'll need to create a storage location corresponding to the App and store the obb file there. This is:
/sdcard/Android/obb/com.example.obbexample

The software is provided as-is according to the attached licence. 
Please don't make contact with support requests.
