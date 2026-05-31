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

public class SparseBackupConfigRsp extends AbstractModel {

    /**
    * <p>Sparse backup switch: ON/OFF</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparseBackupSwitch")
    @Expose
    private String SparseBackupSwitch;

    /**
    * <p>Sparse backup policy list (1-3)</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SparseBackupConfigInfos")
    @Expose
    private SparseBackupConfigInfo [] SparseBackupConfigInfos;

    /**
     * Get <p>Sparse backup switch: ON/OFF</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparseBackupSwitch <p>Sparse backup switch: ON/OFF</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSparseBackupSwitch() {
        return this.SparseBackupSwitch;
    }

    /**
     * Set <p>Sparse backup switch: ON/OFF</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparseBackupSwitch <p>Sparse backup switch: ON/OFF</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparseBackupSwitch(String SparseBackupSwitch) {
        this.SparseBackupSwitch = SparseBackupSwitch;
    }

    /**
     * Get <p>Sparse backup policy list (1-3)</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SparseBackupConfigInfos <p>Sparse backup policy list (1-3)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SparseBackupConfigInfo [] getSparseBackupConfigInfos() {
        return this.SparseBackupConfigInfos;
    }

    /**
     * Set <p>Sparse backup policy list (1-3)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SparseBackupConfigInfos <p>Sparse backup policy list (1-3)</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSparseBackupConfigInfos(SparseBackupConfigInfo [] SparseBackupConfigInfos) {
        this.SparseBackupConfigInfos = SparseBackupConfigInfos;
    }

    public SparseBackupConfigRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparseBackupConfigRsp(SparseBackupConfigRsp source) {
        if (source.SparseBackupSwitch != null) {
            this.SparseBackupSwitch = new String(source.SparseBackupSwitch);
        }
        if (source.SparseBackupConfigInfos != null) {
            this.SparseBackupConfigInfos = new SparseBackupConfigInfo[source.SparseBackupConfigInfos.length];
            for (int i = 0; i < source.SparseBackupConfigInfos.length; i++) {
                this.SparseBackupConfigInfos[i] = new SparseBackupConfigInfo(source.SparseBackupConfigInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SparseBackupSwitch", this.SparseBackupSwitch);
        this.setParamArrayObj(map, prefix + "SparseBackupConfigInfos.", this.SparseBackupConfigInfos);

    }
}

