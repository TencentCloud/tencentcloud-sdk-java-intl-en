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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportTableFileRequest extends AbstractModel {

    /**
    * Project ID associated with the table
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Table name: Up to 200 characters in length is supported.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Table file COS object path
    */
    @SerializedName("CosUri")
    @Expose
    private String CosUri;

    /**
    * Data type of each column in the table file. Supported types include Int, Float, String, File, Boolean, Array[Int], Array[Float], Array[String], Array[File], and Array[Boolean].
    */
    @SerializedName("DataType")
    @Expose
    private String [] DataType;

    /**
    * Table description: Up to 500 characters in length is supported.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Project ID associated with the table 
     * @return ProjectId Project ID associated with the table
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID associated with the table
     * @param ProjectId Project ID associated with the table
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Table name: Up to 200 characters in length is supported. 
     * @return Name Table name: Up to 200 characters in length is supported.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Table name: Up to 200 characters in length is supported.
     * @param Name Table name: Up to 200 characters in length is supported.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Table file COS object path 
     * @return CosUri Table file COS object path
     */
    public String getCosUri() {
        return this.CosUri;
    }

    /**
     * Set Table file COS object path
     * @param CosUri Table file COS object path
     */
    public void setCosUri(String CosUri) {
        this.CosUri = CosUri;
    }

    /**
     * Get Data type of each column in the table file. Supported types include Int, Float, String, File, Boolean, Array[Int], Array[Float], Array[String], Array[File], and Array[Boolean]. 
     * @return DataType Data type of each column in the table file. Supported types include Int, Float, String, File, Boolean, Array[Int], Array[Float], Array[String], Array[File], and Array[Boolean].
     */
    public String [] getDataType() {
        return this.DataType;
    }

    /**
     * Set Data type of each column in the table file. Supported types include Int, Float, String, File, Boolean, Array[Int], Array[Float], Array[String], Array[File], and Array[Boolean].
     * @param DataType Data type of each column in the table file. Supported types include Int, Float, String, File, Boolean, Array[Int], Array[Float], Array[String], Array[File], and Array[Boolean].
     */
    public void setDataType(String [] DataType) {
        this.DataType = DataType;
    }

    /**
     * Get Table description: Up to 500 characters in length is supported. 
     * @return Description Table description: Up to 500 characters in length is supported.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Table description: Up to 500 characters in length is supported.
     * @param Description Table description: Up to 500 characters in length is supported.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ImportTableFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportTableFileRequest(ImportTableFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CosUri != null) {
            this.CosUri = new String(source.CosUri);
        }
        if (source.DataType != null) {
            this.DataType = new String[source.DataType.length];
            for (int i = 0; i < source.DataType.length; i++) {
                this.DataType[i] = new String(source.DataType[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CosUri", this.CosUri);
        this.setParamArraySimple(map, prefix + "DataType.", this.DataType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

