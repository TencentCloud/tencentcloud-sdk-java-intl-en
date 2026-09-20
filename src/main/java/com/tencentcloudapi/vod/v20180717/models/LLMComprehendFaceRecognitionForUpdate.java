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

public class LLMComprehendFaceRecognitionForUpdate extends AbstractModel {

    /**
    * <p>Face recognition task switch</p><p>Enumeration values: </p><ul><li>ON: Enable intelligent face recognition task</li><li>OFF: Disable intelligent face recognition task</li></ul><p>Default value: OFF</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned.</p><p>Value range: [0, 100]</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results are returned.</p><p>Enumeration values:</p><ul><li>entertainment: entertainment star</li><li>sport: sports celebrity</li><li>politician: political figure</li></ul>
    */
    @SerializedName("DefaultLibraryLabelSet")
    @Expose
    private String [] DefaultLibraryLabelSet;

    /**
    * <p>User-defined character filter tag, specifying the tag of the user-defined character to return. If not filled or empty, all customized figure results will be returned. </p><p>Input parameter limit: up to 100 tags, each tag can contain up to 16 characters.</p>
    */
    @SerializedName("UserDefineLibraryLabelSet")
    @Expose
    private String [] UserDefineLibraryLabelSet;

    /**
    * <p>Figure library selection</p><p>Enumeration values:</p><ul><li>Default: Use the default figure library</li><li>UserDefine: Use a user-defined figure library</li><li>All: Use both the default and user-defined figure libraries</li></ul><p>Default value: All</p>
    */
    @SerializedName("FaceLibrary")
    @Expose
    private String FaceLibrary;

    /**
     * Get <p>Face recognition task switch</p><p>Enumeration values: </p><ul><li>ON: Enable intelligent face recognition task</li><li>OFF: Disable intelligent face recognition task</li></ul><p>Default value: OFF</p> 
     * @return Switch <p>Face recognition task switch</p><p>Enumeration values: </p><ul><li>ON: Enable intelligent face recognition task</li><li>OFF: Disable intelligent face recognition task</li></ul><p>Default value: OFF</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Face recognition task switch</p><p>Enumeration values: </p><ul><li>ON: Enable intelligent face recognition task</li><li>OFF: Disable intelligent face recognition task</li></ul><p>Default value: OFF</p>
     * @param Switch <p>Face recognition task switch</p><p>Enumeration values: </p><ul><li>ON: Enable intelligent face recognition task</li><li>OFF: Disable intelligent face recognition task</li></ul><p>Default value: OFF</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned.</p><p>Value range: [0, 100]</p> 
     * @return Score <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned.</p><p>Value range: [0, 100]</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned.</p><p>Value range: [0, 100]</p>
     * @param Score <p>Face recognition filter score. When the recognition result reaches this score or above, the recognition result is returned.</p><p>Value range: [0, 100]</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results are returned.</p><p>Enumeration values:</p><ul><li>entertainment: entertainment star</li><li>sport: sports celebrity</li><li>politician: political figure</li></ul> 
     * @return DefaultLibraryLabelSet <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results are returned.</p><p>Enumeration values:</p><ul><li>entertainment: entertainment star</li><li>sport: sports celebrity</li><li>politician: political figure</li></ul>
     */
    public String [] getDefaultLibraryLabelSet() {
        return this.DefaultLibraryLabelSet;
    }

    /**
     * Set <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results are returned.</p><p>Enumeration values:</p><ul><li>entertainment: entertainment star</li><li>sport: sports celebrity</li><li>politician: political figure</li></ul>
     * @param DefaultLibraryLabelSet <p>Default character filter tag, specify the tag of the default character to return. If not filled or empty, all default character results are returned.</p><p>Enumeration values:</p><ul><li>entertainment: entertainment star</li><li>sport: sports celebrity</li><li>politician: political figure</li></ul>
     */
    public void setDefaultLibraryLabelSet(String [] DefaultLibraryLabelSet) {
        this.DefaultLibraryLabelSet = DefaultLibraryLabelSet;
    }

    /**
     * Get <p>User-defined character filter tag, specifying the tag of the user-defined character to return. If not filled or empty, all customized figure results will be returned. </p><p>Input parameter limit: up to 100 tags, each tag can contain up to 16 characters.</p> 
     * @return UserDefineLibraryLabelSet <p>User-defined character filter tag, specifying the tag of the user-defined character to return. If not filled or empty, all customized figure results will be returned. </p><p>Input parameter limit: up to 100 tags, each tag can contain up to 16 characters.</p>
     */
    public String [] getUserDefineLibraryLabelSet() {
        return this.UserDefineLibraryLabelSet;
    }

    /**
     * Set <p>User-defined character filter tag, specifying the tag of the user-defined character to return. If not filled or empty, all customized figure results will be returned. </p><p>Input parameter limit: up to 100 tags, each tag can contain up to 16 characters.</p>
     * @param UserDefineLibraryLabelSet <p>User-defined character filter tag, specifying the tag of the user-defined character to return. If not filled or empty, all customized figure results will be returned. </p><p>Input parameter limit: up to 100 tags, each tag can contain up to 16 characters.</p>
     */
    public void setUserDefineLibraryLabelSet(String [] UserDefineLibraryLabelSet) {
        this.UserDefineLibraryLabelSet = UserDefineLibraryLabelSet;
    }

    /**
     * Get <p>Figure library selection</p><p>Enumeration values:</p><ul><li>Default: Use the default figure library</li><li>UserDefine: Use a user-defined figure library</li><li>All: Use both the default and user-defined figure libraries</li></ul><p>Default value: All</p> 
     * @return FaceLibrary <p>Figure library selection</p><p>Enumeration values:</p><ul><li>Default: Use the default figure library</li><li>UserDefine: Use a user-defined figure library</li><li>All: Use both the default and user-defined figure libraries</li></ul><p>Default value: All</p>
     */
    public String getFaceLibrary() {
        return this.FaceLibrary;
    }

    /**
     * Set <p>Figure library selection</p><p>Enumeration values:</p><ul><li>Default: Use the default figure library</li><li>UserDefine: Use a user-defined figure library</li><li>All: Use both the default and user-defined figure libraries</li></ul><p>Default value: All</p>
     * @param FaceLibrary <p>Figure library selection</p><p>Enumeration values:</p><ul><li>Default: Use the default figure library</li><li>UserDefine: Use a user-defined figure library</li><li>All: Use both the default and user-defined figure libraries</li></ul><p>Default value: All</p>
     */
    public void setFaceLibrary(String FaceLibrary) {
        this.FaceLibrary = FaceLibrary;
    }

    public LLMComprehendFaceRecognitionForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMComprehendFaceRecognitionForUpdate(LLMComprehendFaceRecognitionForUpdate source) {
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

