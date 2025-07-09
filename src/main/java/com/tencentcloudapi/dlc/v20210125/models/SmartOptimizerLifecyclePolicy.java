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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartOptimizerLifecyclePolicy extends AbstractModel {

    /**
    * Enable the lifecycle
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LifecycleEnable")
    @Expose
    private String LifecycleEnable;

    /**
    * Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Expiration")
    @Expose
    private Long Expiration;

    /**
    * Whether to delete the table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DropTable")
    @Expose
    private Boolean DropTable;

    /**
    * Expired fields
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiredField")
    @Expose
    private String ExpiredField;

    /**
    * Expired field format
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiredFieldFormat")
    @Expose
    private String ExpiredFieldFormat;

    /**
     * Get Enable the lifecycle
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LifecycleEnable Enable the lifecycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLifecycleEnable() {
        return this.LifecycleEnable;
    }

    /**
     * Set Enable the lifecycle
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LifecycleEnable Enable the lifecycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLifecycleEnable(String LifecycleEnable) {
        this.LifecycleEnable = LifecycleEnable;
    }

    /**
     * Get Expiration time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Expiration Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExpiration() {
        return this.Expiration;
    }

    /**
     * Set Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Expiration Expiration time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiration(Long Expiration) {
        this.Expiration = Expiration;
    }

    /**
     * Get Whether to delete the table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DropTable Whether to delete the table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getDropTable() {
        return this.DropTable;
    }

    /**
     * Set Whether to delete the table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DropTable Whether to delete the table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDropTable(Boolean DropTable) {
        this.DropTable = DropTable;
    }

    /**
     * Get Expired fields
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredField Expired fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredField() {
        return this.ExpiredField;
    }

    /**
     * Set Expired fields
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpiredField Expired fields
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiredField(String ExpiredField) {
        this.ExpiredField = ExpiredField;
    }

    /**
     * Get Expired field format
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredFieldFormat Expired field format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredFieldFormat() {
        return this.ExpiredFieldFormat;
    }

    /**
     * Set Expired field format
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpiredFieldFormat Expired field format
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiredFieldFormat(String ExpiredFieldFormat) {
        this.ExpiredFieldFormat = ExpiredFieldFormat;
    }

    public SmartOptimizerLifecyclePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartOptimizerLifecyclePolicy(SmartOptimizerLifecyclePolicy source) {
        if (source.LifecycleEnable != null) {
            this.LifecycleEnable = new String(source.LifecycleEnable);
        }
        if (source.Expiration != null) {
            this.Expiration = new Long(source.Expiration);
        }
        if (source.DropTable != null) {
            this.DropTable = new Boolean(source.DropTable);
        }
        if (source.ExpiredField != null) {
            this.ExpiredField = new String(source.ExpiredField);
        }
        if (source.ExpiredFieldFormat != null) {
            this.ExpiredFieldFormat = new String(source.ExpiredFieldFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecycleEnable", this.LifecycleEnable);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "DropTable", this.DropTable);
        this.setParamSimple(map, prefix + "ExpiredField", this.ExpiredField);
        this.setParamSimple(map, prefix + "ExpiredFieldFormat", this.ExpiredFieldFormat);

    }
}

