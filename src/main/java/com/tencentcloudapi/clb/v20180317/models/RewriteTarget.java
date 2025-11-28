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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RewriteTarget extends AbstractModel {

    /**
    * Listener ID of the redirection target. this field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetListenerId")
    @Expose
    private String TargetListenerId;

    /**
    * Specifies the forwarding rule ID of redirection target. field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetLocationId")
    @Expose
    private String TargetLocationId;

    /**
    * Specifies the redirection status code.
    */
    @SerializedName("RewriteCode")
    @Expose
    private Long RewriteCode;

    /**
    * Whether the matched URL is carried in redirection
    */
    @SerializedName("TakeUrl")
    @Expose
    private Boolean TakeUrl;

    /**
    * Redirection type. Manual: Manual redirection; Auto: Automatic redirection
    */
    @SerializedName("RewriteType")
    @Expose
    private String RewriteType;

    /**
     * Get Listener ID of the redirection target. this field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetListenerId Listener ID of the redirection target. this field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetListenerId() {
        return this.TargetListenerId;
    }

    /**
     * Set Listener ID of the redirection target. this field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetListenerId Listener ID of the redirection target. this field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetListenerId(String TargetListenerId) {
        this.TargetListenerId = TargetListenerId;
    }

    /**
     * Get Specifies the forwarding rule ID of redirection target. field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetLocationId Specifies the forwarding rule ID of redirection target. field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetLocationId() {
        return this.TargetLocationId;
    }

    /**
     * Set Specifies the forwarding rule ID of redirection target. field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetLocationId Specifies the forwarding rule ID of redirection target. field is valid only when redirection is configured.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetLocationId(String TargetLocationId) {
        this.TargetLocationId = TargetLocationId;
    }

    /**
     * Get Specifies the redirection status code. 
     * @return RewriteCode Specifies the redirection status code.
     */
    public Long getRewriteCode() {
        return this.RewriteCode;
    }

    /**
     * Set Specifies the redirection status code.
     * @param RewriteCode Specifies the redirection status code.
     */
    public void setRewriteCode(Long RewriteCode) {
        this.RewriteCode = RewriteCode;
    }

    /**
     * Get Whether the matched URL is carried in redirection 
     * @return TakeUrl Whether the matched URL is carried in redirection
     */
    public Boolean getTakeUrl() {
        return this.TakeUrl;
    }

    /**
     * Set Whether the matched URL is carried in redirection
     * @param TakeUrl Whether the matched URL is carried in redirection
     */
    public void setTakeUrl(Boolean TakeUrl) {
        this.TakeUrl = TakeUrl;
    }

    /**
     * Get Redirection type. Manual: Manual redirection; Auto: Automatic redirection 
     * @return RewriteType Redirection type. Manual: Manual redirection; Auto: Automatic redirection
     */
    public String getRewriteType() {
        return this.RewriteType;
    }

    /**
     * Set Redirection type. Manual: Manual redirection; Auto: Automatic redirection
     * @param RewriteType Redirection type. Manual: Manual redirection; Auto: Automatic redirection
     */
    public void setRewriteType(String RewriteType) {
        this.RewriteType = RewriteType;
    }

    public RewriteTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RewriteTarget(RewriteTarget source) {
        if (source.TargetListenerId != null) {
            this.TargetListenerId = new String(source.TargetListenerId);
        }
        if (source.TargetLocationId != null) {
            this.TargetLocationId = new String(source.TargetLocationId);
        }
        if (source.RewriteCode != null) {
            this.RewriteCode = new Long(source.RewriteCode);
        }
        if (source.TakeUrl != null) {
            this.TakeUrl = new Boolean(source.TakeUrl);
        }
        if (source.RewriteType != null) {
            this.RewriteType = new String(source.RewriteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetListenerId", this.TargetListenerId);
        this.setParamSimple(map, prefix + "TargetLocationId", this.TargetLocationId);
        this.setParamSimple(map, prefix + "RewriteCode", this.RewriteCode);
        this.setParamSimple(map, prefix + "TakeUrl", this.TakeUrl);
        this.setParamSimple(map, prefix + "RewriteType", this.RewriteType);

    }
}

