/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmevr.input;

import com.jme3.math.Matrix4f;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;

/**
 *
 * @author phr00t
 */
public interface VRHMD {
    
    // identification
    public String getName();
    
    // init & de-init
    public boolean initialize();   
    public void forceInitializeSuccess();    
    public void initRendering(int width, int height, int samples);
    public HMDInfo updateHMDInfo();
    public HMDInfo getHMDInfo();
    public void destroy();    
    public boolean isInitialized();
    public void reset();

    // HMDInfo
    public int getHResolution();    
    public float getFOV();
    public int getVResolution();
    public float getInterpupillaryDistance();
    public float getEyeHeight();

    // orientation and pos info
    public void updatePose();
    public Quaternion getOrientation();    
    public Vector3f getPosition();    
    public Vector3f getAngularAcceleration();
    public Vector3f getPositionalAcceleration();    
    public Vector3f getAccelerometer();
    public Matrix4f getPositionAndOrientation();
    public Matrix4f getEyeTransform(int eye);

}