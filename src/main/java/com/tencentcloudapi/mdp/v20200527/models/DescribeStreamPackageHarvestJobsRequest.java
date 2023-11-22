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

public class DescribeStreamPackageHarvestJobsRequest extends AbstractModel {

    /**
    * The bound channel name. If not passed, all channels will be queried by default.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * Page number.
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * PageSize.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get The bound channel name. If not passed, all channels will be queried by default. 
     * @return ChannelName The bound channel name. If not passed, all channels will be queried by default.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set The bound channel name. If not passed, all channels will be queried by default.
     * @param ChannelName The bound channel name. If not passed, all channels will be queried by default.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get Page number. 
     * @return PageNum Page number.
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set Page number.
     * @param PageNum Page number.
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get PageSize. 
     * @return PageSize PageSize.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set PageSize.
     * @param PageSize PageSize.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeStreamPackageHarvestJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPackageHarvestJobsRequest(DescribeStreamPackageHarvestJobsRequest source) {
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

