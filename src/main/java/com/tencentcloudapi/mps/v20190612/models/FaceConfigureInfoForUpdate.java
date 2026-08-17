/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceConfigureInfoForUpdate extends AbstractModel {

    /**
    * Face Recognition task switch. Valid values:
<li>ON: Enable intelligent face recognition task.</li>
<li>OFF: Disables the intelligent face recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Face recognition filter score. Returns the recognition result when the recognition result reaches this score or higher. Value ranges from 0 to 100.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * Default character filter tag. Specify the tag of the default character to be returned. If left blank or empty, all default character results will be returned. Tag value range:
<li>entertainment: entertainment star;</li>
<li>Sport: sports celebrity;</li>
<li>politician: sensitive person.</li>
    */
    @SerializedName("DefaultLibraryLabelSet")
    @Expose
    private String [] DefaultLibraryLabelSet;

    /**
    * User-defined character filter tag. Specify the tag of the user-defined character to return. If left blank or empty, all custom character results are returned.
The number of tags is up to 100, and each tag can have up to 16 characters.
    */
    @SerializedName("UserDefineLibraryLabelSet")
    @Expose
    private String [] UserDefineLibraryLabelSet;

    /**
    * Figure library selection. Available values:
<li>Default: Use default character library;</li>
<li>UserDefine: Use the user-defined character library.</li>
<li>All: Use default character library and user-defined character library simultaneously.</li>
    */
    @SerializedName("FaceLibrary")
    @Expose
    private String FaceLibrary;

    /**
     * Get Face Recognition task switch. Valid values:
<li>ON: Enable intelligent face recognition task.</li>
<li>OFF: Disables the intelligent face recognition task.</li> 
     * @return Switch Face Recognition task switch. Valid values:
<li>ON: Enable intelligent face recognition task.</li>
<li>OFF: Disables the intelligent face recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Face Recognition task switch. Valid values:
<li>ON: Enable intelligent face recognition task.</li>
<li>OFF: Disables the intelligent face recognition task.</li>
     * @param Switch Face Recognition task switch. Valid values:
<li>ON: Enable intelligent face recognition task.</li>
<li>OFF: Disables the intelligent face recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Face recognition filter score. Returns the recognition result when the recognition result reaches this score or higher. Value ranges from 0 to 100. 
     * @return Score Face recognition filter score. Returns the recognition result when the recognition result reaches this score or higher. Value ranges from 0 to 100.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Face recognition filter score. Returns the recognition result when the recognition result reaches this score or higher. Value ranges from 0 to 100.
     * @param Score Face recognition filter score. Returns the recognition result when the recognition result reaches this score or higher. Value ranges from 0 to 100.
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get Default character filter tag. Specify the tag of the default character to be returned. If left blank or empty, all default character results will be returned. Tag value range:
<li>entertainment: entertainment star;</li>
<li>Sport: sports celebrity;</li>
<li>politician: sensitive person.</li> 
     * @return DefaultLibraryLabelSet Default character filter tag. Specify the tag of the default character to be returned. If left blank or empty, all default character results will be returned. Tag value range:
<li>entertainment: entertainment star;</li>
<li>Sport: sports celebrity;</li>
<li>politician: sensitive person.</li>
     */
    public String [] getDefaultLibraryLabelSet() {
        return this.DefaultLibraryLabelSet;
    }

    /**
     * Set Default character filter tag. Specify the tag of the default character to be returned. If left blank or empty, all default character results will be returned. Tag value range:
<li>entertainment: entertainment star;</li>
<li>Sport: sports celebrity;</li>
<li>politician: sensitive person.</li>
     * @param DefaultLibraryLabelSet Default character filter tag. Specify the tag of the default character to be returned. If left blank or empty, all default character results will be returned. Tag value range:
<li>entertainment: entertainment star;</li>
<li>Sport: sports celebrity;</li>
<li>politician: sensitive person.</li>
     */
    public void setDefaultLibraryLabelSet(String [] DefaultLibraryLabelSet) {
        this.DefaultLibraryLabelSet = DefaultLibraryLabelSet;
    }

    /**
     * Get User-defined character filter tag. Specify the tag of the user-defined character to return. If left blank or empty, all custom character results are returned.
The number of tags is up to 100, and each tag can have up to 16 characters. 
     * @return UserDefineLibraryLabelSet User-defined character filter tag. Specify the tag of the user-defined character to return. If left blank or empty, all custom character results are returned.
The number of tags is up to 100, and each tag can have up to 16 characters.
     */
    public String [] getUserDefineLibraryLabelSet() {
        return this.UserDefineLibraryLabelSet;
    }

    /**
     * Set User-defined character filter tag. Specify the tag of the user-defined character to return. If left blank or empty, all custom character results are returned.
The number of tags is up to 100, and each tag can have up to 16 characters.
     * @param UserDefineLibraryLabelSet User-defined character filter tag. Specify the tag of the user-defined character to return. If left blank or empty, all custom character results are returned.
The number of tags is up to 100, and each tag can have up to 16 characters.
     */
    public void setUserDefineLibraryLabelSet(String [] UserDefineLibraryLabelSet) {
        this.UserDefineLibraryLabelSet = UserDefineLibraryLabelSet;
    }

    /**
     * Get Figure library selection. Available values:
<li>Default: Use default character library;</li>
<li>UserDefine: Use the user-defined character library.</li>
<li>All: Use default character library and user-defined character library simultaneously.</li> 
     * @return FaceLibrary Figure library selection. Available values:
<li>Default: Use default character library;</li>
<li>UserDefine: Use the user-defined character library.</li>
<li>All: Use default character library and user-defined character library simultaneously.</li>
     */
    public String getFaceLibrary() {
        return this.FaceLibrary;
    }

    /**
     * Set Figure library selection. Available values:
<li>Default: Use default character library;</li>
<li>UserDefine: Use the user-defined character library.</li>
<li>All: Use default character library and user-defined character library simultaneously.</li>
     * @param FaceLibrary Figure library selection. Available values:
<li>Default: Use default character library;</li>
<li>UserDefine: Use the user-defined character library.</li>
<li>All: Use default character library and user-defined character library simultaneously.</li>
     */
    public void setFaceLibrary(String FaceLibrary) {
        this.FaceLibrary = FaceLibrary;
    }

    public FaceConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceConfigureInfoForUpdate(FaceConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.DefaultLibraryLabelSet != null) {
            this.DefaultLibraryLabelSet = new String[source.DefaultLibraryLabelSet.length];
            for (int i = 0; i < source.DefaultLibraryLabelSet.length; i++) {
                this.DefaultLibraryLabelSet[i] = new String(source.DefaultLibraryLabelSet[i]);
            }
        }
        if (source.UserDefineLibraryLabelSet != null) {
            this.UserDefineLibraryLabelSet = new String[source.UserDefineLibraryLabelSet.length];
            for (int i = 0; i < source.UserDefineLibraryLabelSet.length; i++) {
                this.UserDefineLibraryLabelSet[i] = new String(source.UserDefineLibraryLabelSet[i]);
            }
        }
        if (source.FaceLibrary != null) {
            this.FaceLibrary = new String(source.FaceLibrary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "DefaultLibraryLabelSet.", this.DefaultLibraryLabelSet);
        this.setParamArraySimple(map, prefix + "UserDefineLibraryLabelSet.", this.UserDefineLibraryLabelSet);
        this.setParamSimple(map, prefix + "FaceLibrary", this.FaceLibrary);

    }
}

