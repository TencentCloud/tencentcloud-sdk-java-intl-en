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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceConfigureInfoForUpdate extends AbstractModel {

    /**
    * <p>Face recognition task switch. Available values:</p><li>ON: Enable the intelligent face recognition task;</li><li>OFF: Disable the intelligent face recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned. Value ranges from 0 to 100.</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results will be returned. Available tag values:</p><li>entertainment: entertainment star;</li><li>sport: sports celebrity;</li><li>politician: relevant people.</li>
    */
    @SerializedName("DefaultLibraryLabelSet")
    @Expose
    private String [] DefaultLibraryLabelSet;

    /**
    * <p>User-defined character filter tags. Specify the tags of user-defined characters to return. If not specified or empty, all customized figure results are returned.<br>Up to 100 tags, each up to 16 characters in length.</p>
    */
    @SerializedName("UserDefineLibraryLabelSet")
    @Expose
    private String [] UserDefineLibraryLabelSet;

    /**
    * <p>Character library selection. Available values:</p><li>Default: use the default character library;</li><li>UserDefine: use a user-defined character library.</li><li>All: use both the default and user-defined character libraries.</li>
    */
    @SerializedName("FaceLibrary")
    @Expose
    private String FaceLibrary;

    /**
     * Get <p>Face recognition task switch. Available values:</p><li>ON: Enable the intelligent face recognition task;</li><li>OFF: Disable the intelligent face recognition task.</li> 
     * @return Switch <p>Face recognition task switch. Available values:</p><li>ON: Enable the intelligent face recognition task;</li><li>OFF: Disable the intelligent face recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Face recognition task switch. Available values:</p><li>ON: Enable the intelligent face recognition task;</li><li>OFF: Disable the intelligent face recognition task.</li>
     * @param Switch <p>Face recognition task switch. Available values:</p><li>ON: Enable the intelligent face recognition task;</li><li>OFF: Disable the intelligent face recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned. Value ranges from 0 to 100.</p> 
     * @return Score <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned. Value ranges from 0 to 100.</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned. Value ranges from 0 to 100.</p>
     * @param Score <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned. Value ranges from 0 to 100.</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results will be returned. Available tag values:</p><li>entertainment: entertainment star;</li><li>sport: sports celebrity;</li><li>politician: relevant people.</li> 
     * @return DefaultLibraryLabelSet <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results will be returned. Available tag values:</p><li>entertainment: entertainment star;</li><li>sport: sports celebrity;</li><li>politician: relevant people.</li>
     */
    public String [] getDefaultLibraryLabelSet() {
        return this.DefaultLibraryLabelSet;
    }

    /**
     * Set <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results will be returned. Available tag values:</p><li>entertainment: entertainment star;</li><li>sport: sports celebrity;</li><li>politician: relevant people.</li>
     * @param DefaultLibraryLabelSet <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results will be returned. Available tag values:</p><li>entertainment: entertainment star;</li><li>sport: sports celebrity;</li><li>politician: relevant people.</li>
     */
    public void setDefaultLibraryLabelSet(String [] DefaultLibraryLabelSet) {
        this.DefaultLibraryLabelSet = DefaultLibraryLabelSet;
    }

    /**
     * Get <p>User-defined character filter tags. Specify the tags of user-defined characters to return. If not specified or empty, all customized figure results are returned.<br>Up to 100 tags, each up to 16 characters in length.</p> 
     * @return UserDefineLibraryLabelSet <p>User-defined character filter tags. Specify the tags of user-defined characters to return. If not specified or empty, all customized figure results are returned.<br>Up to 100 tags, each up to 16 characters in length.</p>
     */
    public String [] getUserDefineLibraryLabelSet() {
        return this.UserDefineLibraryLabelSet;
    }

    /**
     * Set <p>User-defined character filter tags. Specify the tags of user-defined characters to return. If not specified or empty, all customized figure results are returned.<br>Up to 100 tags, each up to 16 characters in length.</p>
     * @param UserDefineLibraryLabelSet <p>User-defined character filter tags. Specify the tags of user-defined characters to return. If not specified or empty, all customized figure results are returned.<br>Up to 100 tags, each up to 16 characters in length.</p>
     */
    public void setUserDefineLibraryLabelSet(String [] UserDefineLibraryLabelSet) {
        this.UserDefineLibraryLabelSet = UserDefineLibraryLabelSet;
    }

    /**
     * Get <p>Character library selection. Available values:</p><li>Default: use the default character library;</li><li>UserDefine: use a user-defined character library.</li><li>All: use both the default and user-defined character libraries.</li> 
     * @return FaceLibrary <p>Character library selection. Available values:</p><li>Default: use the default character library;</li><li>UserDefine: use a user-defined character library.</li><li>All: use both the default and user-defined character libraries.</li>
     */
    public String getFaceLibrary() {
        return this.FaceLibrary;
    }

    /**
     * Set <p>Character library selection. Available values:</p><li>Default: use the default character library;</li><li>UserDefine: use a user-defined character library.</li><li>All: use both the default and user-defined character libraries.</li>
     * @param FaceLibrary <p>Character library selection. Available values:</p><li>Default: use the default character library;</li><li>UserDefine: use a user-defined character library.</li><li>All: use both the default and user-defined character libraries.</li>
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

