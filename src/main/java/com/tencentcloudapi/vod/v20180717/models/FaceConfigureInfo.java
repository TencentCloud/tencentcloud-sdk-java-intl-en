/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceConfigureInfo extends AbstractModel{

    /**
    * Switch of face recognition task. Valid values:
<li>ON: enables intelligent face recognition task;</li>
<li>OFF: disables intelligent face recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Face recognition filter score. If this score is reached or exceeded, a recognition result will be returned. Value range: 0–100. Default value: 95.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * Default figure filter tag, which specifies the default figure tag that needs to be returned. If this parameter is left empty or a blank value is entered, all results of the default figures will be returned. Valid values:
<li>entertainment: entertainment celebrity;</li>
<li>sport: sports celebrity;</li>
<li>politician: politically sensitive figure.</li>
    */
    @SerializedName("DefaultLibraryLabelSet")
    @Expose
    private String [] DefaultLibraryLabelSet;

    /**
    * Custom face labels for filtering. After you specify a label, callbacks of face images without this label will be returned. If this parameter is not specified or left empty, callbacks of all face images will be returned.
You can specify up to 100 labels, with each containing up to 16 characters.
    */
    @SerializedName("UserDefineLibraryLabelSet")
    @Expose
    private String [] UserDefineLibraryLabelSet;

    /**
    * Figure library. Valid values:
<li>Default: default figure library;</li>
<li>UserDefine: custom figure library.</li>
<li>All: both default and custom figure libraries will be used.</li>
Default value: All (both default and custom figure libraries will be used.)
    */
    @SerializedName("FaceLibrary")
    @Expose
    private String FaceLibrary;

    /**
     * Get Switch of face recognition task. Valid values:
<li>ON: enables intelligent face recognition task;</li>
<li>OFF: disables intelligent face recognition task.</li> 
     * @return Switch Switch of face recognition task. Valid values:
<li>ON: enables intelligent face recognition task;</li>
<li>OFF: disables intelligent face recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of face recognition task. Valid values:
<li>ON: enables intelligent face recognition task;</li>
<li>OFF: disables intelligent face recognition task.</li>
     * @param Switch Switch of face recognition task. Valid values:
<li>ON: enables intelligent face recognition task;</li>
<li>OFF: disables intelligent face recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Face recognition filter score. If this score is reached or exceeded, a recognition result will be returned. Value range: 0–100. Default value: 95. 
     * @return Score Face recognition filter score. If this score is reached or exceeded, a recognition result will be returned. Value range: 0–100. Default value: 95.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Face recognition filter score. If this score is reached or exceeded, a recognition result will be returned. Value range: 0–100. Default value: 95.
     * @param Score Face recognition filter score. If this score is reached or exceeded, a recognition result will be returned. Value range: 0–100. Default value: 95.
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get Default figure filter tag, which specifies the default figure tag that needs to be returned. If this parameter is left empty or a blank value is entered, all results of the default figures will be returned. Valid values:
<li>entertainment: entertainment celebrity;</li>
<li>sport: sports celebrity;</li>
<li>politician: politically sensitive figure.</li> 
     * @return DefaultLibraryLabelSet Default figure filter tag, which specifies the default figure tag that needs to be returned. If this parameter is left empty or a blank value is entered, all results of the default figures will be returned. Valid values:
<li>entertainment: entertainment celebrity;</li>
<li>sport: sports celebrity;</li>
<li>politician: politically sensitive figure.</li>
     */
    public String [] getDefaultLibraryLabelSet() {
        return this.DefaultLibraryLabelSet;
    }

    /**
     * Set Default figure filter tag, which specifies the default figure tag that needs to be returned. If this parameter is left empty or a blank value is entered, all results of the default figures will be returned. Valid values:
<li>entertainment: entertainment celebrity;</li>
<li>sport: sports celebrity;</li>
<li>politician: politically sensitive figure.</li>
     * @param DefaultLibraryLabelSet Default figure filter tag, which specifies the default figure tag that needs to be returned. If this parameter is left empty or a blank value is entered, all results of the default figures will be returned. Valid values:
<li>entertainment: entertainment celebrity;</li>
<li>sport: sports celebrity;</li>
<li>politician: politically sensitive figure.</li>
     */
    public void setDefaultLibraryLabelSet(String [] DefaultLibraryLabelSet) {
        this.DefaultLibraryLabelSet = DefaultLibraryLabelSet;
    }

    /**
     * Get Custom face labels for filtering. After you specify a label, callbacks of face images without this label will be returned. If this parameter is not specified or left empty, callbacks of all face images will be returned.
You can specify up to 100 labels, with each containing up to 16 characters. 
     * @return UserDefineLibraryLabelSet Custom face labels for filtering. After you specify a label, callbacks of face images without this label will be returned. If this parameter is not specified or left empty, callbacks of all face images will be returned.
You can specify up to 100 labels, with each containing up to 16 characters.
     */
    public String [] getUserDefineLibraryLabelSet() {
        return this.UserDefineLibraryLabelSet;
    }

    /**
     * Set Custom face labels for filtering. After you specify a label, callbacks of face images without this label will be returned. If this parameter is not specified or left empty, callbacks of all face images will be returned.
You can specify up to 100 labels, with each containing up to 16 characters.
     * @param UserDefineLibraryLabelSet Custom face labels for filtering. After you specify a label, callbacks of face images without this label will be returned. If this parameter is not specified or left empty, callbacks of all face images will be returned.
You can specify up to 100 labels, with each containing up to 16 characters.
     */
    public void setUserDefineLibraryLabelSet(String [] UserDefineLibraryLabelSet) {
        this.UserDefineLibraryLabelSet = UserDefineLibraryLabelSet;
    }

    /**
     * Get Figure library. Valid values:
<li>Default: default figure library;</li>
<li>UserDefine: custom figure library.</li>
<li>All: both default and custom figure libraries will be used.</li>
Default value: All (both default and custom figure libraries will be used.) 
     * @return FaceLibrary Figure library. Valid values:
<li>Default: default figure library;</li>
<li>UserDefine: custom figure library.</li>
<li>All: both default and custom figure libraries will be used.</li>
Default value: All (both default and custom figure libraries will be used.)
     */
    public String getFaceLibrary() {
        return this.FaceLibrary;
    }

    /**
     * Set Figure library. Valid values:
<li>Default: default figure library;</li>
<li>UserDefine: custom figure library.</li>
<li>All: both default and custom figure libraries will be used.</li>
Default value: All (both default and custom figure libraries will be used.)
     * @param FaceLibrary Figure library. Valid values:
<li>Default: default figure library;</li>
<li>UserDefine: custom figure library.</li>
<li>All: both default and custom figure libraries will be used.</li>
Default value: All (both default and custom figure libraries will be used.)
     */
    public void setFaceLibrary(String FaceLibrary) {
        this.FaceLibrary = FaceLibrary;
    }

    public FaceConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceConfigureInfo(FaceConfigureInfo source) {
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

