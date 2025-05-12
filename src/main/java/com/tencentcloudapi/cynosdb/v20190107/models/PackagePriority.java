/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class PackagePriority extends AbstractModel {

    /**
    * The resource pack whose deduction priority needs to be customized.
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Custom deduction priority.
    */
    @SerializedName("DeductionPriority")
    @Expose
    private Long DeductionPriority;

    /**
     * Get The resource pack whose deduction priority needs to be customized. 
     * @return PackageId The resource pack whose deduction priority needs to be customized.
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set The resource pack whose deduction priority needs to be customized.
     * @param PackageId The resource pack whose deduction priority needs to be customized.
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Custom deduction priority. 
     * @return DeductionPriority Custom deduction priority.
     */
    public Long getDeductionPriority() {
        return this.DeductionPriority;
    }

    /**
     * Set Custom deduction priority.
     * @param DeductionPriority Custom deduction priority.
     */
    public void setDeductionPriority(Long DeductionPriority) {
        this.DeductionPriority = DeductionPriority;
    }

    public PackagePriority() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackagePriority(PackagePriority source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.DeductionPriority != null) {
            this.DeductionPriority = new Long(source.DeductionPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "DeductionPriority", this.DeductionPriority);

    }
}

