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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkipCheckItemRequest extends AbstractModel{

    /**
    * Data migration task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * ID of the check step to be skipped, which is obtained in the `StepInfo[i].StepId` field returned by the `DescribeMigrationCheckJob` API, such as "OptimizeCheck".
    */
    @SerializedName("StepIds")
    @Expose
    private String [] StepIds;

    /**
    * When the check fails due to foreign key dependency, you can use this field to specify whether to migrate the foreign key dependency. The foreign key dependency won’t be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `shield`, and will be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `migrate`.
    */
    @SerializedName("ForeignKeyFlag")
    @Expose
    private String ForeignKeyFlag;

    /**
     * Get Data migration task ID 
     * @return JobId Data migration task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Data migration task ID
     * @param JobId Data migration task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get ID of the check step to be skipped, which is obtained in the `StepInfo[i].StepId` field returned by the `DescribeMigrationCheckJob` API, such as "OptimizeCheck". 
     * @return StepIds ID of the check step to be skipped, which is obtained in the `StepInfo[i].StepId` field returned by the `DescribeMigrationCheckJob` API, such as "OptimizeCheck".
     */
    public String [] getStepIds() {
        return this.StepIds;
    }

    /**
     * Set ID of the check step to be skipped, which is obtained in the `StepInfo[i].StepId` field returned by the `DescribeMigrationCheckJob` API, such as "OptimizeCheck".
     * @param StepIds ID of the check step to be skipped, which is obtained in the `StepInfo[i].StepId` field returned by the `DescribeMigrationCheckJob` API, such as "OptimizeCheck".
     */
    public void setStepIds(String [] StepIds) {
        this.StepIds = StepIds;
    }

    /**
     * Get When the check fails due to foreign key dependency, you can use this field to specify whether to migrate the foreign key dependency. The foreign key dependency won’t be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `shield`, and will be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `migrate`. 
     * @return ForeignKeyFlag When the check fails due to foreign key dependency, you can use this field to specify whether to migrate the foreign key dependency. The foreign key dependency won’t be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `shield`, and will be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `migrate`.
     */
    public String getForeignKeyFlag() {
        return this.ForeignKeyFlag;
    }

    /**
     * Set When the check fails due to foreign key dependency, you can use this field to specify whether to migrate the foreign key dependency. The foreign key dependency won’t be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `shield`, and will be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `migrate`.
     * @param ForeignKeyFlag When the check fails due to foreign key dependency, you can use this field to specify whether to migrate the foreign key dependency. The foreign key dependency won’t be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `shield`, and will be migrated when `StepIds` contains `ConstraintCheck` and the value of this field is `migrate`.
     */
    public void setForeignKeyFlag(String ForeignKeyFlag) {
        this.ForeignKeyFlag = ForeignKeyFlag;
    }

    public SkipCheckItemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkipCheckItemRequest(SkipCheckItemRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StepIds != null) {
            this.StepIds = new String[source.StepIds.length];
            for (int i = 0; i < source.StepIds.length; i++) {
                this.StepIds[i] = new String(source.StepIds[i]);
            }
        }
        if (source.ForeignKeyFlag != null) {
            this.ForeignKeyFlag = new String(source.ForeignKeyFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "StepIds.", this.StepIds);
        this.setParamSimple(map, prefix + "ForeignKeyFlag", this.ForeignKeyFlag);

    }
}

