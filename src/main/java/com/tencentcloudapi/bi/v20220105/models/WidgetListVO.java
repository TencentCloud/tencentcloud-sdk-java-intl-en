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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WidgetListVO extends AbstractModel {

    /**
    * uin
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CorpId")
    @Expose
    private String CorpId;

    /**
    * Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Page ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * Component array.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WidgetList")
    @Expose
    private WidgetVO [] WidgetList;

    /**
     * Get uin
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CorpId uin
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCorpId() {
        return this.CorpId;
    }

    /**
     * Set uin
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CorpId uin
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCorpId(String CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get Project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Page ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PageId Page ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set Page ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PageId Page ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get Component array.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WidgetList Component array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WidgetVO [] getWidgetList() {
        return this.WidgetList;
    }

    /**
     * Set Component array.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WidgetList Component array.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWidgetList(WidgetVO [] WidgetList) {
        this.WidgetList = WidgetList;
    }

    public WidgetListVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WidgetListVO(WidgetListVO source) {
        if (source.CorpId != null) {
            this.CorpId = new String(source.CorpId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.WidgetList != null) {
            this.WidgetList = new WidgetVO[source.WidgetList.length];
            for (int i = 0; i < source.WidgetList.length; i++) {
                this.WidgetList[i] = new WidgetVO(source.WidgetList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamArrayObj(map, prefix + "WidgetList.", this.WidgetList);

    }
}

