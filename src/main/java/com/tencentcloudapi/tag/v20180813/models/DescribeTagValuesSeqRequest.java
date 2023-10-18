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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagValuesSeqRequest extends AbstractModel {

    /**
    * Tag key list
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * Creator `Uin`. If this parameter is blank or left empty, only `Uin` will be used as a condition for query
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of entries per page. Default value: 15
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Tag key list 
     * @return TagKeys Tag key list
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set Tag key list
     * @param TagKeys Tag key list
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get Creator `Uin`. If this parameter is blank or left empty, only `Uin` will be used as a condition for query 
     * @return CreateUin Creator `Uin`. If this parameter is blank or left empty, only `Uin` will be used as a condition for query
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set Creator `Uin`. If this parameter is blank or left empty, only `Uin` will be used as a condition for query
     * @param CreateUin Creator `Uin`. If this parameter is blank or left empty, only `Uin` will be used as a condition for query
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter 
     * @return Offset Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
     * @param Offset Data offset. Default value: 0. It must be an integer multiple of the `Limit` parameter
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of entries per page. Default value: 15 
     * @return Limit Number of entries per page. Default value: 15
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of entries per page. Default value: 15
     * @param Limit Number of entries per page. Default value: 15
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTagValuesSeqRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagValuesSeqRequest(DescribeTagValuesSeqRequest source) {
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.CreateUin != null) {
            this.CreateUin = new Long(source.CreateUin);
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
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

