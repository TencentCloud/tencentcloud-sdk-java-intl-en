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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFilesRequest extends AbstractModel {

    /**
    * Array of Project ID.
    */
    @SerializedName("ProjectIds")
    @Expose
    private String [] ProjectIds;

    /**
    * Array of File ID.
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * Filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Offset. Default value is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returns. Default value is 20, maximum is 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file.
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
     * Get Array of Project ID. 
     * @return ProjectIds Array of Project ID.
     */
    public String [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Array of Project ID.
     * @param ProjectIds Array of Project ID.
     */
    public void setProjectIds(String [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Array of File ID. 
     * @return FileIds Array of File ID.
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set Array of File ID.
     * @param FileIds Array of File ID.
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get Filename 
     * @return FileName Filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Filename
     * @param FileName Filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Offset. Default value is 0. 
     * @return Offset Offset. Default value is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value is 0.
     * @param Offset Offset. Default value is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returns. Default value is 20, maximum is 100 
     * @return Limit Number of returns. Default value is 20, maximum is 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returns. Default value is 20, maximum is 100
     * @param Limit Number of returns. Default value is 20, maximum is 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file. 
     * @return Kind File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file.
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file.
     * @param Kind File type. 1 represents parameter file, 2 represents protocol file, 3 represents request file.
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    public DescribeFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFilesRequest(DescribeFilesRequest source) {
        if (source.ProjectIds != null) {
            this.ProjectIds = new String[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new String(source.ProjectIds[i]);
            }
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

