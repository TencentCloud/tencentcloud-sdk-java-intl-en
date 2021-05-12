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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUploadedFilesRequest extends AbstractModel{

    /**
    * File path. `OwnerUin` information of the root account should be entered in this field.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Record offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results to be returned for a single request. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get File path. `OwnerUin` information of the root account should be entered in this field. 
     * @return Path File path. `OwnerUin` information of the root account should be entered in this field.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set File path. `OwnerUin` information of the root account should be entered in this field.
     * @param Path File path. `OwnerUin` information of the root account should be entered in this field.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Record offset. Default value: 0. 
     * @return Offset Record offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Record offset. Default value: 0.
     * @param Offset Record offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results to be returned for a single request. Default value: 20. 
     * @return Limit Number of results to be returned for a single request. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results to be returned for a single request. Default value: 20.
     * @param Limit Number of results to be returned for a single request. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeUploadedFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUploadedFilesRequest(DescribeUploadedFilesRequest source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

