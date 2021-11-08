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
package com.tencentcloudapi.ip.v20210409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCreditHistoryRequest extends AbstractModel{

    /**
    * Customer UIN
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * Page number
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of data entries per page
    */
    @SerializedName("PageRow")
    @Expose
    private Long PageRow;

    /**
     * Get Customer UIN 
     * @return ClientUin Customer UIN
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Customer UIN
     * @param ClientUin Customer UIN
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get Page number 
     * @return Page Page number
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number
     * @param Page Page number
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of data entries per page 
     * @return PageRow Number of data entries per page
     */
    public Long getPageRow() {
        return this.PageRow;
    }

    /**
     * Set Number of data entries per page
     * @param PageRow Number of data entries per page
     */
    public void setPageRow(Long PageRow) {
        this.PageRow = PageRow;
    }

    public QueryCreditHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCreditHistoryRequest(QueryCreditHistoryRequest source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageRow != null) {
            this.PageRow = new Long(source.PageRow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageRow", this.PageRow);

    }
}
