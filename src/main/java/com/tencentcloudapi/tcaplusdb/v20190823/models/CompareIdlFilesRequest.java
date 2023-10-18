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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareIdlFilesRequest extends AbstractModel {

    /**
    * ID of the cluster where the table to be modified resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * List of tables to be modified
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfoNew [] SelectedTables;

    /**
    * Selected list of uploaded IDL files. Either this parameter or `NewIdlFiles` must be selected
    */
    @SerializedName("ExistingIdlFiles")
    @Expose
    private IdlFileInfo [] ExistingIdlFiles;

    /**
    * List of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be selected
    */
    @SerializedName("NewIdlFiles")
    @Expose
    private IdlFileInfo [] NewIdlFiles;

    /**
     * Get ID of the cluster where the table to be modified resides 
     * @return ClusterId ID of the cluster where the table to be modified resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where the table to be modified resides
     * @param ClusterId ID of the cluster where the table to be modified resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get List of tables to be modified 
     * @return SelectedTables List of tables to be modified
     */
    public SelectedTableInfoNew [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * Set List of tables to be modified
     * @param SelectedTables List of tables to be modified
     */
    public void setSelectedTables(SelectedTableInfoNew [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * Get Selected list of uploaded IDL files. Either this parameter or `NewIdlFiles` must be selected 
     * @return ExistingIdlFiles Selected list of uploaded IDL files. Either this parameter or `NewIdlFiles` must be selected
     */
    public IdlFileInfo [] getExistingIdlFiles() {
        return this.ExistingIdlFiles;
    }

    /**
     * Set Selected list of uploaded IDL files. Either this parameter or `NewIdlFiles` must be selected
     * @param ExistingIdlFiles Selected list of uploaded IDL files. Either this parameter or `NewIdlFiles` must be selected
     */
    public void setExistingIdlFiles(IdlFileInfo [] ExistingIdlFiles) {
        this.ExistingIdlFiles = ExistingIdlFiles;
    }

    /**
     * Get List of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be selected 
     * @return NewIdlFiles List of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be selected
     */
    public IdlFileInfo [] getNewIdlFiles() {
        return this.NewIdlFiles;
    }

    /**
     * Set List of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be selected
     * @param NewIdlFiles List of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be selected
     */
    public void setNewIdlFiles(IdlFileInfo [] NewIdlFiles) {
        this.NewIdlFiles = NewIdlFiles;
    }

    public CompareIdlFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareIdlFilesRequest(CompareIdlFilesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SelectedTables != null) {
            this.SelectedTables = new SelectedTableInfoNew[source.SelectedTables.length];
            for (int i = 0; i < source.SelectedTables.length; i++) {
                this.SelectedTables[i] = new SelectedTableInfoNew(source.SelectedTables[i]);
            }
        }
        if (source.ExistingIdlFiles != null) {
            this.ExistingIdlFiles = new IdlFileInfo[source.ExistingIdlFiles.length];
            for (int i = 0; i < source.ExistingIdlFiles.length; i++) {
                this.ExistingIdlFiles[i] = new IdlFileInfo(source.ExistingIdlFiles[i]);
            }
        }
        if (source.NewIdlFiles != null) {
            this.NewIdlFiles = new IdlFileInfo[source.NewIdlFiles.length];
            for (int i = 0; i < source.NewIdlFiles.length; i++) {
                this.NewIdlFiles[i] = new IdlFileInfo(source.NewIdlFiles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);
        this.setParamArrayObj(map, prefix + "ExistingIdlFiles.", this.ExistingIdlFiles);
        this.setParamArrayObj(map, prefix + "NewIdlFiles.", this.NewIdlFiles);

    }
}

