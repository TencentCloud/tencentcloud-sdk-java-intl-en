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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VLPlanResultSnapshotImageUrlInfo extends AbstractModel {

    /**
    * <p>Analysis result ID</p>
    */
    @SerializedName("VLPlanResultId")
    @Expose
    private String VLPlanResultId;

    /**
    * <p>Source material download URL (empty if unsuccessful)</p>
    */
    @SerializedName("SourceFileURL")
    @Expose
    private String SourceFileURL;

    /**
    * <p>URL validity period (seconds; 0 on failure)</p>
    */
    @SerializedName("Expire")
    @Expose
    private Long Expire;

    /**
    * <p>Error information (has a value on failure)</p>
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get <p>Analysis result ID</p> 
     * @return VLPlanResultId <p>Analysis result ID</p>
     */
    public String getVLPlanResultId() {
        return this.VLPlanResultId;
    }

    /**
     * Set <p>Analysis result ID</p>
     * @param VLPlanResultId <p>Analysis result ID</p>
     */
    public void setVLPlanResultId(String VLPlanResultId) {
        this.VLPlanResultId = VLPlanResultId;
    }

    /**
     * Get <p>Source material download URL (empty if unsuccessful)</p> 
     * @return SourceFileURL <p>Source material download URL (empty if unsuccessful)</p>
     */
    public String getSourceFileURL() {
        return this.SourceFileURL;
    }

    /**
     * Set <p>Source material download URL (empty if unsuccessful)</p>
     * @param SourceFileURL <p>Source material download URL (empty if unsuccessful)</p>
     */
    public void setSourceFileURL(String SourceFileURL) {
        this.SourceFileURL = SourceFileURL;
    }

    /**
     * Get <p>URL validity period (seconds; 0 on failure)</p> 
     * @return Expire <p>URL validity period (seconds; 0 on failure)</p>
     */
    public Long getExpire() {
        return this.Expire;
    }

    /**
     * Set <p>URL validity period (seconds; 0 on failure)</p>
     * @param Expire <p>URL validity period (seconds; 0 on failure)</p>
     */
    public void setExpire(Long Expire) {
        this.Expire = Expire;
    }

    /**
     * Get <p>Error information (has a value on failure)</p> 
     * @return ErrMsg <p>Error information (has a value on failure)</p>
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set <p>Error information (has a value on failure)</p>
     * @param ErrMsg <p>Error information (has a value on failure)</p>
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public VLPlanResultSnapshotImageUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VLPlanResultSnapshotImageUrlInfo(VLPlanResultSnapshotImageUrlInfo source) {
        if (source.VLPlanResultId != null) {
            this.VLPlanResultId = new String(source.VLPlanResultId);
        }
        if (source.SourceFileURL != null) {
            this.SourceFileURL = new String(source.SourceFileURL);
        }
        if (source.Expire != null) {
            this.Expire = new Long(source.Expire);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLPlanResultId", this.VLPlanResultId);
        this.setParamSimple(map, prefix + "SourceFileURL", this.SourceFileURL);
        this.setParamSimple(map, prefix + "Expire", this.Expire);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

