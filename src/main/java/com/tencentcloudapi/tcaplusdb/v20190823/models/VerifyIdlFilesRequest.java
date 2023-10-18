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

public class VerifyIdlFilesRequest extends AbstractModel {

    /**
    * ID of the cluster where to create a table
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * ID of the table group where to create a table
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * List of information of uploaded IDL files. Either this parameter or `NewIdlFiles` must be present
    */
    @SerializedName("ExistingIdlFiles")
    @Expose
    private IdlFileInfo [] ExistingIdlFiles;

    /**
    * List of information of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be present
    */
    @SerializedName("NewIdlFiles")
    @Expose
    private IdlFileInfo [] NewIdlFiles;

    /**
     * Get ID of the cluster where to create a table 
     * @return ClusterId ID of the cluster where to create a table
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where to create a table
     * @param ClusterId ID of the cluster where to create a table
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get ID of the table group where to create a table 
     * @return TableGroupId ID of the table group where to create a table
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set ID of the table group where to create a table
     * @param TableGroupId ID of the table group where to create a table
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get List of information of uploaded IDL files. Either this parameter or `NewIdlFiles` must be present 
     * @return ExistingIdlFiles List of information of uploaded IDL files. Either this parameter or `NewIdlFiles` must be present
     */
    public IdlFileInfo [] getExistingIdlFiles() {
        return this.ExistingIdlFiles;
    }

    /**
     * Set List of information of uploaded IDL files. Either this parameter or `NewIdlFiles` must be present
     * @param ExistingIdlFiles List of information of uploaded IDL files. Either this parameter or `NewIdlFiles` must be present
     */
    public void setExistingIdlFiles(IdlFileInfo [] ExistingIdlFiles) {
        this.ExistingIdlFiles = ExistingIdlFiles;
    }

    /**
     * Get List of information of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be present 
     * @return NewIdlFiles List of information of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be present
     */
    public IdlFileInfo [] getNewIdlFiles() {
        return this.NewIdlFiles;
    }

    /**
     * Set List of information of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be present
     * @param NewIdlFiles List of information of IDL files to be uploaded. Either this parameter or `ExistingIdlFiles` must be present
     */
    public void setNewIdlFiles(IdlFileInfo [] NewIdlFiles) {
        this.NewIdlFiles = NewIdlFiles;
    }

    public VerifyIdlFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyIdlFilesRequest(VerifyIdlFilesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
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
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamArrayObj(map, prefix + "ExistingIdlFiles.", this.ExistingIdlFiles);
        this.setParamArrayObj(map, prefix + "NewIdlFiles.", this.NewIdlFiles);

    }
}

