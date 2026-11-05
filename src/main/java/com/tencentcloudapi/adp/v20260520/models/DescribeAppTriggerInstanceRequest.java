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

public class DescribeAppTriggerInstanceRequest extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Trigger running instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Visitor ID.</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

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
     * Get <p>Trigger running instance ID.</p> 
     * @return InstanceId <p>Trigger running instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Trigger running instance ID.</p>
     * @param InstanceId <p>Trigger running instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table> 
     * @return Scope <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     * @param Scope <table> <tbody> <tr> <td>Enumeration item</td> <td>Enumeration value</td> <td>Description</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_UNSPECIFIED</td> <td>0</td> <td>Unspecified</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_APP</td> <td>1</td> <td>B-end admin</td> </tr> <tr> <td>APP_TRIGGER_SCOPE_USER</td> <td>2</td> <td>C-end visitor</td> </tr> </tbody> </table>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Visitor ID.</p> 
     * @return UserId <p>Visitor ID.</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Visitor ID.</p>
     * @param UserId <p>Visitor ID.</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribeAppTriggerInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppTriggerInstanceRequest(DescribeAppTriggerInstanceRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

