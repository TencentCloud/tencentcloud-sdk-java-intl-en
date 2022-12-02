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

public class CompareAbstractInfo extends AbstractModel{

    /**
    * Comparison conclusion. Valid values: `same`, `different`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * Task status. Valid values: `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Total number of tables
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalTables")
    @Expose
    private Long TotalTables;

    /**
    * Number of checked tables
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CheckedTables")
    @Expose
    private Long CheckedTables;

    /**
    * Number of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DifferentTables")
    @Expose
    private Long DifferentTables;

    /**
    * Number of skipped tables
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkippedTables")
    @Expose
    private Long SkippedTables;

    /**
    * Number of inconsistent data rows
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DifferentRows")
    @Expose
    private Long DifferentRows;

    /**
     * Get Comparison conclusion. Valid values: `same`, `different`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Conclusion Comparison conclusion. Valid values: `same`, `different`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set Comparison conclusion. Valid values: `same`, `different`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Conclusion Comparison conclusion. Valid values: `same`, `different`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get Task status. Valid values: `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Task status. Valid values: `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. Valid values: `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Task status. Valid values: `success`, `failed`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Total number of tables
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalTables Total number of tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalTables() {
        return this.TotalTables;
    }

    /**
     * Set Total number of tables
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalTables Total number of tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalTables(Long TotalTables) {
        this.TotalTables = TotalTables;
    }

    /**
     * Get Number of checked tables
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CheckedTables Number of checked tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCheckedTables() {
        return this.CheckedTables;
    }

    /**
     * Set Number of checked tables
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CheckedTables Number of checked tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCheckedTables(Long CheckedTables) {
        this.CheckedTables = CheckedTables;
    }

    /**
     * Get Number of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DifferentTables Number of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDifferentTables() {
        return this.DifferentTables;
    }

    /**
     * Set Number of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DifferentTables Number of inconsistent tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDifferentTables(Long DifferentTables) {
        this.DifferentTables = DifferentTables;
    }

    /**
     * Get Number of skipped tables
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SkippedTables Number of skipped tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSkippedTables() {
        return this.SkippedTables;
    }

    /**
     * Set Number of skipped tables
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SkippedTables Number of skipped tables
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSkippedTables(Long SkippedTables) {
        this.SkippedTables = SkippedTables;
    }

    /**
     * Get Number of inconsistent data rows
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DifferentRows Number of inconsistent data rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDifferentRows() {
        return this.DifferentRows;
    }

    /**
     * Set Number of inconsistent data rows
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DifferentRows Number of inconsistent data rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDifferentRows(Long DifferentRows) {
        this.DifferentRows = DifferentRows;
    }

    public CompareAbstractInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareAbstractInfo(CompareAbstractInfo source) {
        if (source.Conclusion != null) {
            this.Conclusion = new String(source.Conclusion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TotalTables != null) {
            this.TotalTables = new Long(source.TotalTables);
        }
        if (source.CheckedTables != null) {
            this.CheckedTables = new Long(source.CheckedTables);
        }
        if (source.DifferentTables != null) {
            this.DifferentTables = new Long(source.DifferentTables);
        }
        if (source.SkippedTables != null) {
            this.SkippedTables = new Long(source.SkippedTables);
        }
        if (source.DifferentRows != null) {
            this.DifferentRows = new Long(source.DifferentRows);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TotalTables", this.TotalTables);
        this.setParamSimple(map, prefix + "CheckedTables", this.CheckedTables);
        this.setParamSimple(map, prefix + "DifferentTables", this.DifferentTables);
        this.setParamSimple(map, prefix + "SkippedTables", this.SkippedTables);
        this.setParamSimple(map, prefix + "DifferentRows", this.DifferentRows);

    }
}

