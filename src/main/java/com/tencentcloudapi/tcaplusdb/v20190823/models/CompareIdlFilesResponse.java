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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareIdlFilesResponse extends AbstractModel{

    /**
    * Information list of all IDL files uploaded and verified in this request
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * Number of tables verified to be valid in this request
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Verification result parsed from the selected table after the IDL description file is read
    */
    @SerializedName("TableInfos")
    @Expose
    private ParsedTableInfoNew [] TableInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information list of all IDL files uploaded and verified in this request 
     * @return IdlFiles Information list of all IDL files uploaded and verified in this request
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * Set Information list of all IDL files uploaded and verified in this request
     * @param IdlFiles Information list of all IDL files uploaded and verified in this request
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * Get Number of tables verified to be valid in this request 
     * @return TotalCount Number of tables verified to be valid in this request
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of tables verified to be valid in this request
     * @param TotalCount Number of tables verified to be valid in this request
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Verification result parsed from the selected table after the IDL description file is read 
     * @return TableInfos Verification result parsed from the selected table after the IDL description file is read
     */
    public ParsedTableInfoNew [] getTableInfos() {
        return this.TableInfos;
    }

    /**
     * Set Verification result parsed from the selected table after the IDL description file is read
     * @param TableInfos Verification result parsed from the selected table after the IDL description file is read
     */
    public void setTableInfos(ParsedTableInfoNew [] TableInfos) {
        this.TableInfos = TableInfos;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TableInfos.", this.TableInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

