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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPackageSourcesRequest extends AbstractModel {

    /**
    * Paging query page number, the value range is [1, 1000].
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * Paging query the size of each page, the value range is [1, 1000].
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Location Id, query all sources under the location.
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * The type of source is divided into live broadcast and on-demand VOD.
Optional values: Live, VOD.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Paging query page number, the value range is [1, 1000]. 
     * @return PageNum Paging query page number, the value range is [1, 1000].
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Paging query page number, the value range is [1, 1000].
     * @param PageNum Paging query page number, the value range is [1, 1000].
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get Paging query the size of each page, the value range is [1, 1000]. 
     * @return PageSize Paging query the size of each page, the value range is [1, 1000].
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Paging query the size of each page, the value range is [1, 1000].
     * @param PageSize Paging query the size of each page, the value range is [1, 1000].
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Location Id, query all sources under the location. 
     * @return LocationId Location Id, query all sources under the location.
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set Location Id, query all sources under the location.
     * @param LocationId Location Id, query all sources under the location.
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get The type of source is divided into live broadcast and on-demand VOD.
Optional values: Live, VOD. 
     * @return Type The type of source is divided into live broadcast and on-demand VOD.
Optional values: Live, VOD.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The type of source is divided into live broadcast and on-demand VOD.
Optional values: Live, VOD.
     * @param Type The type of source is divided into live broadcast and on-demand VOD.
Optional values: Live, VOD.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeStreamPackageSourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageSourcesRequest(DescribeStreamPackageSourcesRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

