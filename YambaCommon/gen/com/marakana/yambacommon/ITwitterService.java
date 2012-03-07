/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/marko/github/yamba/YambaCommon/src/com/marakana/yambacommon/ITwitterService.aidl
 */
package com.marakana.yambacommon;
public interface ITwitterService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.marakana.yambacommon.ITwitterService
{
private static final java.lang.String DESCRIPTOR = "com.marakana.yambacommon.ITwitterService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.marakana.yambacommon.ITwitterService interface,
 * generating a proxy if needed.
 */
public static com.marakana.yambacommon.ITwitterService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.marakana.yambacommon.ITwitterService))) {
return ((com.marakana.yambacommon.ITwitterService)iin);
}
return new com.marakana.yambacommon.ITwitterService.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_updateStatus:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.updateStatus(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_update:
{
data.enforceInterface(DESCRIPTOR);
com.marakana.yambacommon.YambaStatus _arg0;
if ((0!=data.readInt())) {
_arg0 = com.marakana.yambacommon.YambaStatus.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.update(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_asyncUpdate:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.marakana.yambacommon.IYambaListener _arg1;
_arg1 = com.marakana.yambacommon.IYambaListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.asyncUpdate(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.marakana.yambacommon.ITwitterService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public boolean updateStatus(java.lang.String status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(status);
mRemote.transact(Stub.TRANSACTION_updateStatus, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean update(com.marakana.yambacommon.YambaStatus status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((status!=null)) {
_data.writeInt(1);
status.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_update, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean asyncUpdate(java.lang.String status, com.marakana.yambacommon.IYambaListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(status);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_asyncUpdate, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_updateStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_update = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_asyncUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public boolean updateStatus(java.lang.String status) throws android.os.RemoteException;
public boolean update(com.marakana.yambacommon.YambaStatus status) throws android.os.RemoteException;
public boolean asyncUpdate(java.lang.String status, com.marakana.yambacommon.IYambaListener listener) throws android.os.RemoteException;
}
