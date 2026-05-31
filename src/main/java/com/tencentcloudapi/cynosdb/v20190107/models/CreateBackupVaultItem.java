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

public class CreateBackupVaultItem extends AbstractModel {

    /**
    * Safe id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VaultId")
    @Expose
    private String VaultId;

    /**
    * Safe region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VaultRegion")
    @Expose
    private String VaultRegion;

    /**
     * Get Safe id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VaultId Safe id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVaultId() {
        return this.VaultId;
    }

    /**
     * Set Safe id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VaultId Safe id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVaultId(String VaultId) {
        this.VaultId = VaultId;
    }

    /**
     * Get Safe region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VaultRegion Safe region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVaultRegion() {
        return this.VaultRegion;
    }

    /**
     * Set Safe region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VaultRegion Safe region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVaultRegion(String VaultRegion) {
        this.VaultRegion = VaultRegion;
    }

    public CreateBackupVaultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupVaultItem(CreateBackupVaultItem source) {
        if (source.VaultId != null) {
            this.VaultId = new String(source.VaultId);
        }
        if (source.VaultRegion != null) {
            this.VaultRegion = new String(source.VaultRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VaultId", this.VaultId);
        this.setParamSimple(map, prefix + "VaultRegion", this.VaultRegion);

    }
}

