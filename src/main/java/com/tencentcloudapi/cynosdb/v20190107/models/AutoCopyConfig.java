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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoCopyConfig extends AbstractModel {

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Safe ID
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * Safe region
    */
    @SerializedName("VaultRegion")
    @Expose
    private String VaultRegion;

    /**
    * Delivery Type: binlog, redolog, snapshot, logic
    */
    @SerializedName("CopyType")
    @Expose
    private String CopyType;

    /**
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Safe ID 
     * @return VaultId Safe ID
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set Safe ID
     * @param VaultId Safe ID
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get Safe region 
     * @return VaultRegion Safe region
     */
    public String getVaultRegion() {
        return this.VaultRegion;
    }

    /**
     * Set Safe region
     * @param VaultRegion Safe region
     */
    public void setVaultRegion(String VaultRegion) {
        this.VaultRegion = VaultRegion;
    }

    /**
     * Get Delivery Type: binlog, redolog, snapshot, logic 
     * @return CopyType Delivery Type: binlog, redolog, snapshot, logic
     */
    public String getCopyType() {
        return this.CopyType;
    }

    /**
     * Set Delivery Type: binlog, redolog, snapshot, logic
     * @param CopyType Delivery Type: binlog, redolog, snapshot, logic
     */
    public void setCopyType(String CopyType) {
        this.CopyType = CopyType;
    }

    public AutoCopyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoCopyConfig(AutoCopyConfig source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultRegion != null) {
            this.VaultRegion = new String(source.VaultRegion);
        }
        if (source.CopyType != null) {
            this.CopyType = new String(source.CopyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultRegion", this.VaultRegion);
        this.setParamSimple(map, prefix + "CopyType", this.CopyType);

    }
}

