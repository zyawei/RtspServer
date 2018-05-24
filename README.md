# about
    
    Select rtsp section from https://github.com/fyhertz/spydroid-ipcamera.
    
# how to

- Step 1. Add the JitPack repository to your build file
  
      allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
      }
      
      
- Step 2. Add the dependency
    
      dependencies {
            implementation 'com.github.zyawei:RtspServer:1.0.0'
      }        