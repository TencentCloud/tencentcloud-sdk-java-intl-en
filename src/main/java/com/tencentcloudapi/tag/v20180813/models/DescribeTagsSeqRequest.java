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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagsSeqRequest extends AbstractModel{

    /**
    * Tag key, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag value, which either exists or does not exist with the tag key. If it does not exist, all tags of the user will be queried
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

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
    * Creator `Uin`. If this parameter is blank or left empty, only `Uin` will be used as a condition for query
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Tag key array, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried. If it is passed in together with `TagKey`, it will be used and the `TagKey` will be ignored.
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * Whether to show project tag
    */
    @SerializedName("ShowProject")
    @Expose
    private Long ShowProject;

    /**
     * Get Tag key, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried 
     * @return TagKey Tag key, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried
     * @param TagKey Tag key, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag value, which either exists or does not exist with the tag key. If it does not exist, all tags of the user will be queried 
     * @return TagValue Tag value, which either exists or does not exist with the tag key. If it does not exist, all tags of the user will be queried
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value, which either exists or does not exist with the tag key. If it does not exist, all tags of the user will be queried
     * @param TagValue Tag value, which either exists or does not exist with the tag key. If it does not exist, all tags of the user will be queried
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
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
     * Get Tag key array, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried. If it is passed in together with `TagKey`, it will be used and the `TagKey` will be ignored. 
     * @return TagKeys Tag key array, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried. If it is passed in together with `TagKey`, it will be used and the `TagKey` will be ignored.
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set Tag key array, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried. If it is passed in together with `TagKey`, it will be used and the `TagKey` will be ignored.
     * @param TagKeys Tag key array, which either exists or does not exist with the tag value. If it does not exist, all tags of the user will be queried. If it is passed in together with `TagKey`, it will be used and the `TagKey` will be ignored.
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get Whether to show project tag 
     * @return ShowProject Whether to show project tag
     */
    public Long getShowProject() {
        return this.ShowProject;
    }

    /**
     * Set Whether to show project tag
     * @param ShowProject Whether to show project tag
     */
    public void setShowProject(Long ShowProject) {
        this.ShowProject = ShowProject;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "ShowProject", this.ShowProject);

    }
}

