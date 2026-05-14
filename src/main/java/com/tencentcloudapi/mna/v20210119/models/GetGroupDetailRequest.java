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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetGroupDetailRequest extends AbstractModel {

    /**
    * group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Display per page number of records. When PageSize and PageNumber are -1, match all devices by 1 page with no limit entries.	
Example value: 1.

    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Number of records displayed per page. When PageSize and PageNumber are both -1, match all devices by 1 page with no limit entries.	
Example value: 10.

    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Search Keywords
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
     * Get group ID 
     * @return GroupId group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set group ID
     * @param GroupId group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Display per page number of records. When PageSize and PageNumber are -1, match all devices by 1 page with no limit entries.	
Example value: 1.
 
     * @return PageSize Display per page number of records. When PageSize and PageNumber are -1, match all devices by 1 page with no limit entries.	
Example value: 1.

     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Display per page number of records. When PageSize and PageNumber are -1, match all devices by 1 page with no limit entries.	
Example value: 1.

     * @param PageSize Display per page number of records. When PageSize and PageNumber are -1, match all devices by 1 page with no limit entries.	
Example value: 1.

     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Number of records displayed per page. When PageSize and PageNumber are both -1, match all devices by 1 page with no limit entries.	
Example value: 10.
 
     * @return PageNumber Number of records displayed per page. When PageSize and PageNumber are both -1, match all devices by 1 page with no limit entries.	
Example value: 10.

     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Number of records displayed per page. When PageSize and PageNumber are both -1, match all devices by 1 page with no limit entries.	
Example value: 10.

     * @param PageNumber Number of records displayed per page. When PageSize and PageNumber are both -1, match all devices by 1 page with no limit entries.	
Example value: 10.

     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Search Keywords 
     * @return KeyWord Search Keywords
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set Search Keywords
     * @param KeyWord Search Keywords
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    public GetGroupDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetGroupDetailRequest(GetGroupDetailRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);

    }
}

