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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosPermissionInfo extends AbstractModel {

    /**
    * Permission source
    */
    @SerializedName("PermissionSource")
    @Expose
    private String PermissionSource;

    /**
    * Permission content
    */
    @SerializedName("PermissionContent")
    @Expose
    private String PermissionContent;

    /**
    * Authorize resources
    */
    @SerializedName("GrantResource")
    @Expose
    private String GrantResource;

    /**
    * Authorize the action
    */
    @SerializedName("GrantAction")
    @Expose
    private String GrantAction;

    /**
    * Authorization conditions
    */
    @SerializedName("GrantCondition")
    @Expose
    private String GrantCondition;

    /**
     * Get Permission source 
     * @return PermissionSource Permission source
     */
    public String getPermissionSource() {
        return this.PermissionSource;
    }

    /**
     * Set Permission source
     * @param PermissionSource Permission source
     */
    public void setPermissionSource(String PermissionSource) {
        this.PermissionSource = PermissionSource;
    }

    /**
     * Get Permission content 
     * @return PermissionContent Permission content
     */
    public String getPermissionContent() {
        return this.PermissionContent;
    }

    /**
     * Set Permission content
     * @param PermissionContent Permission content
     */
    public void setPermissionContent(String PermissionContent) {
        this.PermissionContent = PermissionContent;
    }

    /**
     * Get Authorize resources 
     * @return GrantResource Authorize resources
     */
    public String getGrantResource() {
        return this.GrantResource;
    }

    /**
     * Set Authorize resources
     * @param GrantResource Authorize resources
     */
    public void setGrantResource(String GrantResource) {
        this.GrantResource = GrantResource;
    }

    /**
     * Get Authorize the action 
     * @return GrantAction Authorize the action
     */
    public String getGrantAction() {
        return this.GrantAction;
    }

    /**
     * Set Authorize the action
     * @param GrantAction Authorize the action
     */
    public void setGrantAction(String GrantAction) {
        this.GrantAction = GrantAction;
    }

    /**
     * Get Authorization conditions 
     * @return GrantCondition Authorization conditions
     */
    public String getGrantCondition() {
        return this.GrantCondition;
    }

    /**
     * Set Authorization conditions
     * @param GrantCondition Authorization conditions
     */
    public void setGrantCondition(String GrantCondition) {
        this.GrantCondition = GrantCondition;
    }

    public CosPermissionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosPermissionInfo(CosPermissionInfo source) {
        if (source.PermissionSource != null) {
            this.PermissionSource = new String(source.PermissionSource);
        }
        if (source.PermissionContent != null) {
            this.PermissionContent = new String(source.PermissionContent);
        }
        if (source.GrantResource != null) {
            this.GrantResource = new String(source.GrantResource);
        }
        if (source.GrantAction != null) {
            this.GrantAction = new String(source.GrantAction);
        }
        if (source.GrantCondition != null) {
            this.GrantCondition = new String(source.GrantCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PermissionSource", this.PermissionSource);
        this.setParamSimple(map, prefix + "PermissionContent", this.PermissionContent);
        this.setParamSimple(map, prefix + "GrantResource", this.GrantResource);
        this.setParamSimple(map, prefix + "GrantAction", this.GrantAction);
        this.setParamSimple(map, prefix + "GrantCondition", this.GrantCondition);

    }
}

