#-------------------------------------------------------------------------------
# Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
# 
# All  rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
# used under the terms of its associated license document.  You  may  NOT  copy,
# modify,  sublicense,  or  distribute this source file or portions of it unless
# previously authorized in writing by OBCOM INGENIERIA S.A. In any  event,  this
# notice and above copyright must always be included verbatim with this file.
#-------------------------------------------------------------------------------

# Before Java 9 the runtime classes are in rt.jar
-libraryjars <java.home>/lib/rt.jar
-libraryjars <java.home>/lib/ext/jfxrt.jar

# As of Java 9 the runtime classes are packaged in modular jmod files
#-libraryjars <java.home>/jmods/java.base.jmod(!**.jar;!module-info.class)
#-libraryjars <java.home>/jmods/...

# Optimization options
-optimizationpasses 3
-allowaccessmodification
-mergeinterfacesaggressively
-overloadaggressively 

# Options so we can de-obfuscate stack traces
-renamesourcefileattribute SourceFile
-keepattributes Exceptions,InnerClasses,Signature,Deprecated,
                SourceFile,LineNumberTable,EnclosingMethod

# Preserve annotations and modules
-keepattributes *Annotation*,Module*

# Preserve all package-info files
-keep class **.package-info

# Preserve internationalization files
-keep public class **.i18n.*

# Preserve FXML fields
-keepclassmembers class * {
    @javafx.fxml.FXML *;
}

# Preserve all public classes
-keep public class * {
    public protected *;
}

# Preserve class$ method names
-keepclassmembernames class * {
    java.lang.Class class$(java.lang.String);
    java.lang.Class class$(java.lang.String, boolean);
}

# Preserve native method names and the names of their classes
-keepclasseswithmembernames,includedescriptorclasses class * {
    native <methods>;
}

# Preserve static methods required in enumeration
-keepclassmembers,allowoptimization enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

# Explicitly preserve serialization members
-keepnames public class * implements java.io.Serializable
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}
