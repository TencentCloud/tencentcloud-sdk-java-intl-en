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

public class IsolateClusterRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * This parameter has been disused.
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 
    */
    @SerializedName("IsolateReasonTypes")
    @Expose
    private Long [] IsolateReasonTypes;

    /**
    * 
    */
    @SerializedName("IsolateReason")
    @Expose
    private String IsolateReason;

    /**
    * Retain backup, true - Retained (incur fees)
    */
    @SerializedName("SaveBackup")
    @Expose
    private Boolean SaveBackup;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get This parameter has been disused. 
     * @return DbType This parameter has been disused.
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set This parameter has been disused.
     * @param DbType This parameter has been disused.
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get  
     * @return IsolateReasonTypes 
     */
    public Long [] getIsolateReasonTypes() {
        return this.IsolateReasonTypes;
    }

    /**
     * Set 
     * @param IsolateReasonTypes 
     */
    public void setIsolateReasonTypes(Long [] IsolateReasonTypes) {
        this.IsolateReasonTypes = IsolateReasonTypes;
    }

    /**
     * Get  
     * @return IsolateReason 
     */
    public String getIsolateReason() {
        return this.IsolateReason;
    }

    /**
     * Set 
     * @param IsolateReason 
     */
    public void setIsolateReason(String IsolateReason) {
        this.IsolateReason = IsolateReason;
    }

    /**
     * Get Retain backup, true - Retained (incur fees) 
     * @return SaveBackup Retain backup, true - Retained (incur fees)
     */
    public Boolean getSaveBackup() {
        return this.SaveBackup;
    }

    /**
     * Set Retain backup, true - Retained (incur fees)
     * @param SaveBackup Retain backup, true - Retained (incur fees)
     */
    public void setSaveBackup(Boolean SaveBackup) {
        this.SaveBackup = SaveBackup;
    }

    public IsolateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IsolateClusterRequest(IsolateClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.IsolateReasonTypes != null) {
            this.IsolateReasonTypes = new Long[source.IsolateReasonTypes.length];
            for (int i = 0; i < source.IsolateReasonTypes.length; i++) {
                this.IsolateReasonTypes[i] = new Long(source.IsolateReasonTypes[i]);
            }
        }
        if (source.IsolateReason != null) {
            this.IsolateReason = new String(source.IsolateReason);
        }
        if (source.SaveBackup != null) {
            this.SaveBackup = new Boolean(source.SaveBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamArraySimple(map, prefix + "IsolateReasonTypes.", this.IsolateReasonTypes);
        this.setParamSimple(map, prefix + "IsolateReason", this.IsolateReason);
        this.setParamSimple(map, prefix + "SaveBackup", this.SaveBackup);

    }
}

