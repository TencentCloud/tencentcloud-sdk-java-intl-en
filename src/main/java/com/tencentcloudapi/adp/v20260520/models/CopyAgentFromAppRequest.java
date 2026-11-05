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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyAgentFromAppRequest extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Target application ID. Required when kind=0</p>
    */
    @SerializedName("TargetAppId")
    @Expose
    private String TargetAppId;

    /**
    * <p>Agent type, case-sensitive between B-end configuration Agent and C-end client user Agent</p><p>Enumeration values:</p><ul><li>0: Configuration end Agent</li><li>1: User space Agent</li></ul>
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Target application ID. Required when kind=0</p> 
     * @return TargetAppId <p>Target application ID. Required when kind=0</p>
     */
    public String getTargetAppId() {
        return this.TargetAppId;
    }

    /**
     * Set <p>Target application ID. Required when kind=0</p>
     * @param TargetAppId <p>Target application ID. Required when kind=0</p>
     */
    public void setTargetAppId(String TargetAppId) {
        this.TargetAppId = TargetAppId;
    }

    /**
     * Get <p>Agent type, case-sensitive between B-end configuration Agent and C-end client user Agent</p><p>Enumeration values:</p><ul><li>0: Configuration end Agent</li><li>1: User space Agent</li></ul> 
     * @return Kind <p>Agent type, case-sensitive between B-end configuration Agent and C-end client user Agent</p><p>Enumeration values:</p><ul><li>0: Configuration end Agent</li><li>1: User space Agent</li></ul>
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set <p>Agent type, case-sensitive between B-end configuration Agent and C-end client user Agent</p><p>Enumeration values:</p><ul><li>0: Configuration end Agent</li><li>1: User space Agent</li></ul>
     * @param Kind <p>Agent type, case-sensitive between B-end configuration Agent and C-end client user Agent</p><p>Enumeration values:</p><ul><li>0: Configuration end Agent</li><li>1: User space Agent</li></ul>
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    public CopyAgentFromAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyAgentFromAppRequest(CopyAgentFromAppRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.TargetAppId != null) {
            this.TargetAppId = new String(source.TargetAppId);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "TargetAppId", this.TargetAppId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

