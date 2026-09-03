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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAIWorkbenchArtifactsRequest extends AbstractModel {

    /**
    * <p>Number of items per page</p>
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * <p>Page number.</p>
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * <p>Session ID.</p>
    */
    @SerializedName("SessionIds")
    @Expose
    private String [] SessionIds;

    /**
    * <p>Message content type</p>
    */
    @SerializedName("MimeTypes")
    @Expose
    private String [] MimeTypes;

    /**
    * <p>Sorting order</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get <p>Number of items per page</p> 
     * @return PerPage <p>Number of items per page</p>
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set <p>Number of items per page</p>
     * @param PerPage <p>Number of items per page</p>
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get <p>Page number.</p> 
     * @return PageNo <p>Page number.</p>
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set <p>Page number.</p>
     * @param PageNo <p>Page number.</p>
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get <p>Session ID.</p> 
     * @return SessionIds <p>Session ID.</p>
     */
    public String [] getSessionIds() {
        return this.SessionIds;
    }

    /**
     * Set <p>Session ID.</p>
     * @param SessionIds <p>Session ID.</p>
     */
    public void setSessionIds(String [] SessionIds) {
        this.SessionIds = SessionIds;
    }

    /**
     * Get <p>Message content type</p> 
     * @return MimeTypes <p>Message content type</p>
     */
    public String [] getMimeTypes() {
        return this.MimeTypes;
    }

    /**
     * Set <p>Message content type</p>
     * @param MimeTypes <p>Message content type</p>
     */
    public void setMimeTypes(String [] MimeTypes) {
        this.MimeTypes = MimeTypes;
    }

    /**
     * Get <p>Sorting order</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul> 
     * @return OrderDirection <p>Sorting order</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>Sorting order</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul>
     * @param OrderDirection <p>Sorting order</p><p>Enumeration values:</p><ul><li>ASC: ascending order</li><li>DESC: descending order</li></ul>
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public ListAIWorkbenchArtifactsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchArtifactsRequest(ListAIWorkbenchArtifactsRequest source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.SessionIds != null) {
            this.SessionIds = new String[source.SessionIds.length];
            for (int i = 0; i < source.SessionIds.length; i++) {
                this.SessionIds[i] = new String(source.SessionIds[i]);
            }
        }
        if (source.MimeTypes != null) {
            this.MimeTypes = new String[source.MimeTypes.length];
            for (int i = 0; i < source.MimeTypes.length; i++) {
                this.MimeTypes[i] = new String(source.MimeTypes[i]);
            }
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "SessionIds.", this.SessionIds);
        this.setParamArraySimple(map, prefix + "MimeTypes.", this.MimeTypes);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

