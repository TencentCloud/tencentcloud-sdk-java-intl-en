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

public class AigcFaceInfo extends AbstractModel {

    /**
    * Principal ID. Need to do it yourself to record the returned principal ID.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Face information list.
    */
    @SerializedName("FaceInfoList")
    @Expose
    private AigcFaceIdentityInfo [] FaceInfoList;

    /**
     * Get Principal ID. Need to do it yourself to record the returned principal ID. 
     * @return SessionId Principal ID. Need to do it yourself to record the returned principal ID.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Principal ID. Need to do it yourself to record the returned principal ID.
     * @param SessionId Principal ID. Need to do it yourself to record the returned principal ID.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Face information list. 
     * @return FaceInfoList Face information list.
     */
    public AigcFaceIdentityInfo [] getFaceInfoList() {
        return this.FaceInfoList;
    }

    /**
     * Set Face information list.
     * @param FaceInfoList Face information list.
     */
    public void setFaceInfoList(AigcFaceIdentityInfo [] FaceInfoList) {
        this.FaceInfoList = FaceInfoList;
    }

    public AigcFaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcFaceInfo(AigcFaceInfo source) {
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.FaceInfoList != null) {
            this.FaceInfoList = new AigcFaceIdentityInfo[source.FaceInfoList.length];
            for (int i = 0; i < source.FaceInfoList.length; i++) {
                this.FaceInfoList[i] = new AigcFaceIdentityInfo(source.FaceInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamArrayObj(map, prefix + "FaceInfoList.", this.FaceInfoList);

    }
}

