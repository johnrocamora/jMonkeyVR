package osvrinterface;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.PointerByReference;
import osvrclientkit.OsvrClientKitLibrary.OSVR_ClientInterface;
import osvrclientreporttypes.OSVR_Pose3;
import osvrtimevalue.OSVR_TimeValue;
/**
 * JNA Wrapper for library <b>osvrInterface</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OsvrInterfaceLibrary implements Library {
	public static final String JNA_LIBRARY_NAME = "osvrClientKit";
	public static final NativeLibrary JNA_NATIVE_LIB = NativeLibrary.getInstance(OsvrInterfaceLibrary.JNA_LIBRARY_NAME);
	static {
		Native.register(OsvrInterfaceLibrary.class, OsvrInterfaceLibrary.JNA_NATIVE_LIB);
	}
        
        /** Manually added */
        public static native byte osvrGetPoseState(OSVR_ClientInterface iface, OSVR_TimeValue timestamp, OSVR_Pose3 state);
        
}
