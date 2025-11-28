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

public class LBOperateProtectInfo extends AbstractModel {

    /**
    * CLB instance ID.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Protected status. true means operation protection is enabled. false means operation protection is disabled.
    */
    @SerializedName("ProtectState")
    @Expose
    private Boolean ProtectState;

    /**
    * Specifies the uin for operation protection setting.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperatorUin")
    @Expose
    private String OperatorUin;

    /**
    * Specifies the description when setting operation protection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Specifies the last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get CLB instance ID. 
     * @return LoadBalancerId CLB instance ID.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID.
     * @param LoadBalancerId CLB instance ID.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Protected status. true means operation protection is enabled. false means operation protection is disabled. 
     * @return ProtectState Protected status. true means operation protection is enabled. false means operation protection is disabled.
     */
    public Boolean getProtectState() {
        return this.ProtectState;
    }

    /**
     * Set Protected status. true means operation protection is enabled. false means operation protection is disabled.
     * @param ProtectState Protected status. true means operation protection is enabled. false means operation protection is disabled.
     */
    public void setProtectState(Boolean ProtectState) {
        this.ProtectState = ProtectState;
    }

    /**
     * Get Specifies the uin for operation protection setting.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperatorUin Specifies the uin for operation protection setting.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set Specifies the uin for operation protection setting.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperatorUin Specifies the uin for operation protection setting.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperatorUin(String OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get Specifies the description when setting operation protection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Specifies the description when setting operation protection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Specifies the description when setting operation protection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Specifies the description when setting operation protection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Specifies the last modification time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Specifies the last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Specifies the last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Specifies the last modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public LBOperateProtectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LBOperateProtectInfo(LBOperateProtectInfo source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ProtectState != null) {
            this.ProtectState = new Boolean(source.ProtectState);
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new String(source.OperatorUin);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ProtectState", this.ProtectState);
        this.setParamSimple(map, prefix + "OperatorUin", this.OperatorUin);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

