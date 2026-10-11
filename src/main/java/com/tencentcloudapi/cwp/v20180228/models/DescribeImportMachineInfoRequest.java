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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImportMachineInfoRequest extends AbstractModel {

    /**
    * Array of the server's private IP (default) / server name / server ID (maximum: 1000 entries)
    */
    @SerializedName("MachineList")
    @Expose
    private String [] MachineList;

    /**
    * Data type of batch import. Select one from Ip, Name, and Id.
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * This parameter is discarded.
    */
    @SerializedName("IsQueryProMachine")
    @Expose
    private Boolean IsQueryProMachine;

    /**
    * Filter criteria. <li>Version - String - Required: no - Current protection edition. Valid values: PRO_VERSION (professional edition), BASIC_VERSION (basic edition), Flagship (flagship edition), ProtectedMachines (professional edition + flagship edition), BASIC_PROPOST_GENERAL_DISCOUNT (lightweight edition + professional edition in pay-as-you-go mode + basic edition), and UnFlagship (professional edition in prepaid mode + professional edition in postpaid mode + basic edition + lightweight edition).</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Array of the server's private IP (default) / server name / server ID (maximum: 1000 entries) 
     * @return MachineList Array of the server's private IP (default) / server name / server ID (maximum: 1000 entries)
     */
    public String [] getMachineList() {
        return this.MachineList;
    }

    /**
     * Set Array of the server's private IP (default) / server name / server ID (maximum: 1000 entries)
     * @param MachineList Array of the server's private IP (default) / server name / server ID (maximum: 1000 entries)
     */
    public void setMachineList(String [] MachineList) {
        this.MachineList = MachineList;
    }

    /**
     * Get Data type of batch import. Select one from Ip, Name, and Id. 
     * @return ImportType Data type of batch import. Select one from Ip, Name, and Id.
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set Data type of batch import. Select one from Ip, Name, and Id.
     * @param ImportType Data type of batch import. Select one from Ip, Name, and Id.
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Get This parameter is discarded. 
     * @return IsQueryProMachine This parameter is discarded.
     */
    public Boolean getIsQueryProMachine() {
        return this.IsQueryProMachine;
    }

    /**
     * Set This parameter is discarded.
     * @param IsQueryProMachine This parameter is discarded.
     */
    public void setIsQueryProMachine(Boolean IsQueryProMachine) {
        this.IsQueryProMachine = IsQueryProMachine;
    }

    /**
     * Get Filter criteria. <li>Version - String - Required: no - Current protection edition. Valid values: PRO_VERSION (professional edition), BASIC_VERSION (basic edition), Flagship (flagship edition), ProtectedMachines (professional edition + flagship edition), BASIC_PROPOST_GENERAL_DISCOUNT (lightweight edition + professional edition in pay-as-you-go mode + basic edition), and UnFlagship (professional edition in prepaid mode + professional edition in postpaid mode + basic edition + lightweight edition).</li> 
     * @return Filters Filter criteria. <li>Version - String - Required: no - Current protection edition. Valid values: PRO_VERSION (professional edition), BASIC_VERSION (basic edition), Flagship (flagship edition), ProtectedMachines (professional edition + flagship edition), BASIC_PROPOST_GENERAL_DISCOUNT (lightweight edition + professional edition in pay-as-you-go mode + basic edition), and UnFlagship (professional edition in prepaid mode + professional edition in postpaid mode + basic edition + lightweight edition).</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria. <li>Version - String - Required: no - Current protection edition. Valid values: PRO_VERSION (professional edition), BASIC_VERSION (basic edition), Flagship (flagship edition), ProtectedMachines (professional edition + flagship edition), BASIC_PROPOST_GENERAL_DISCOUNT (lightweight edition + professional edition in pay-as-you-go mode + basic edition), and UnFlagship (professional edition in prepaid mode + professional edition in postpaid mode + basic edition + lightweight edition).</li>
     * @param Filters Filter criteria. <li>Version - String - Required: no - Current protection edition. Valid values: PRO_VERSION (professional edition), BASIC_VERSION (basic edition), Flagship (flagship edition), ProtectedMachines (professional edition + flagship edition), BASIC_PROPOST_GENERAL_DISCOUNT (lightweight edition + professional edition in pay-as-you-go mode + basic edition), and UnFlagship (professional edition in prepaid mode + professional edition in postpaid mode + basic edition + lightweight edition).</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeImportMachineInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImportMachineInfoRequest(DescribeImportMachineInfoRequest source) {
        if (source.MachineList != null) {
            this.MachineList = new String[source.MachineList.length];
            for (int i = 0; i < source.MachineList.length; i++) {
                this.MachineList[i] = new String(source.MachineList[i]);
            }
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
        if (source.IsQueryProMachine != null) {
            this.IsQueryProMachine = new Boolean(source.IsQueryProMachine);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MachineList.", this.MachineList);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "IsQueryProMachine", this.IsQueryProMachine);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

