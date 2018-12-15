# Human-Counter
modified from google tensorflow [examples app](https://github.com/tensorflow/tensorflow/tree/master/tensorflow/examples/android)
 ## Implementation
1. Made video feed widescreen. Image fed to TF is 'squeezed' into 300x300.
2. Separate thread from UI to improve performance as some libraries can't be compiled on Windows.
3. Added a counter to count the number of humans.
4. Added additional activity.
5. Uploaded relevant data onto firebase.
