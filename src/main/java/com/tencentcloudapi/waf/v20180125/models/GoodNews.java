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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GoodNews extends AbstractModel {

    /**
    * Number of products
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Product Detail
    */
    @SerializedName("GoodsDetail")
    @Expose
    private GoodsDetailNew GoodsDetail;

    /**
    * Order type ID, which is used to uniquely identify a business scene. (There are three scenes in total: new purchase, configuration change, and renewal.)
Advanced Edition: 102375 (new purchase), 102376 (renewal), and 102377 (configuration change)
Enterprise Edition: 102378 (new purchase), 102379 (renewal), and 102380 (configuration change)
Ultimate Edition: 102369 (new purchase), 102370 (renewal), and 102371 (configuration change)
Domain name package: 102372 (new purchase), 102373 (renewal), and 102374 (configuration change)
Business expansion package: 101040 (new purchase), 101041 (renewal), and 101042 (configuration change)

Advanced Edition - CLB: 101198 (new purchase), 101199 (renewal), and 101200 (configuration change)
Enterprise Edition - CLB: 101204 (new purchase), 101205 (renewal), and 101206 (configuration change)
Ultimate Edition - CLB: 101201 (new purchase), 101202 (renewal), and 101203 (configuration change)
Domain name package - CLB: 101207 (new purchase), 101208 (renewal), and 101209 (configuration change)
Business expansion package - CLB: 101210 (new purchase), 101211 (renewal), and 101212 (configuration adjustment)

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private Long GoodsCategoryId;

    /**
    * Region ID for purchasing WAF instance

1 indicates purchasing resources in Chinese mainland.
9 indicates purchasing resources outside Chinese mainland.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get Number of products 
     * @return GoodsNum Number of products
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of products
     * @param GoodsNum Number of products
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Product Detail 
     * @return GoodsDetail Product Detail
     */
    public GoodsDetailNew getGoodsDetail() {
        return this.GoodsDetail;
    }

    /**
     * Set Product Detail
     * @param GoodsDetail Product Detail
     */
    public void setGoodsDetail(GoodsDetailNew GoodsDetail) {
        this.GoodsDetail = GoodsDetail;
    }

    /**
     * Get Order type ID, which is used to uniquely identify a business scene. (There are three scenes in total: new purchase, configuration change, and renewal.)
Advanced Edition: 102375 (new purchase), 102376 (renewal), and 102377 (configuration change)
Enterprise Edition: 102378 (new purchase), 102379 (renewal), and 102380 (configuration change)
Ultimate Edition: 102369 (new purchase), 102370 (renewal), and 102371 (configuration change)
Domain name package: 102372 (new purchase), 102373 (renewal), and 102374 (configuration change)
Business expansion package: 101040 (new purchase), 101041 (renewal), and 101042 (configuration change)

Advanced Edition - CLB: 101198 (new purchase), 101199 (renewal), and 101200 (configuration change)
Enterprise Edition - CLB: 101204 (new purchase), 101205 (renewal), and 101206 (configuration change)
Ultimate Edition - CLB: 101201 (new purchase), 101202 (renewal), and 101203 (configuration change)
Domain name package - CLB: 101207 (new purchase), 101208 (renewal), and 101209 (configuration change)
Business expansion package - CLB: 101210 (new purchase), 101211 (renewal), and 101212 (configuration adjustment)

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GoodsCategoryId Order type ID, which is used to uniquely identify a business scene. (There are three scenes in total: new purchase, configuration change, and renewal.)
Advanced Edition: 102375 (new purchase), 102376 (renewal), and 102377 (configuration change)
Enterprise Edition: 102378 (new purchase), 102379 (renewal), and 102380 (configuration change)
Ultimate Edition: 102369 (new purchase), 102370 (renewal), and 102371 (configuration change)
Domain name package: 102372 (new purchase), 102373 (renewal), and 102374 (configuration change)
Business expansion package: 101040 (new purchase), 101041 (renewal), and 101042 (configuration change)

Advanced Edition - CLB: 101198 (new purchase), 101199 (renewal), and 101200 (configuration change)
Enterprise Edition - CLB: 101204 (new purchase), 101205 (renewal), and 101206 (configuration change)
Ultimate Edition - CLB: 101201 (new purchase), 101202 (renewal), and 101203 (configuration change)
Domain name package - CLB: 101207 (new purchase), 101208 (renewal), and 101209 (configuration change)
Business expansion package - CLB: 101210 (new purchase), 101211 (renewal), and 101212 (configuration adjustment)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * Set Order type ID, which is used to uniquely identify a business scene. (There are three scenes in total: new purchase, configuration change, and renewal.)
Advanced Edition: 102375 (new purchase), 102376 (renewal), and 102377 (configuration change)
Enterprise Edition: 102378 (new purchase), 102379 (renewal), and 102380 (configuration change)
Ultimate Edition: 102369 (new purchase), 102370 (renewal), and 102371 (configuration change)
Domain name package: 102372 (new purchase), 102373 (renewal), and 102374 (configuration change)
Business expansion package: 101040 (new purchase), 101041 (renewal), and 101042 (configuration change)

Advanced Edition - CLB: 101198 (new purchase), 101199 (renewal), and 101200 (configuration change)
Enterprise Edition - CLB: 101204 (new purchase), 101205 (renewal), and 101206 (configuration change)
Ultimate Edition - CLB: 101201 (new purchase), 101202 (renewal), and 101203 (configuration change)
Domain name package - CLB: 101207 (new purchase), 101208 (renewal), and 101209 (configuration change)
Business expansion package - CLB: 101210 (new purchase), 101211 (renewal), and 101212 (configuration adjustment)

Note: This field may return null, indicating that no valid values can be obtained.
     * @param GoodsCategoryId Order type ID, which is used to uniquely identify a business scene. (There are three scenes in total: new purchase, configuration change, and renewal.)
Advanced Edition: 102375 (new purchase), 102376 (renewal), and 102377 (configuration change)
Enterprise Edition: 102378 (new purchase), 102379 (renewal), and 102380 (configuration change)
Ultimate Edition: 102369 (new purchase), 102370 (renewal), and 102371 (configuration change)
Domain name package: 102372 (new purchase), 102373 (renewal), and 102374 (configuration change)
Business expansion package: 101040 (new purchase), 101041 (renewal), and 101042 (configuration change)

Advanced Edition - CLB: 101198 (new purchase), 101199 (renewal), and 101200 (configuration change)
Enterprise Edition - CLB: 101204 (new purchase), 101205 (renewal), and 101206 (configuration change)
Ultimate Edition - CLB: 101201 (new purchase), 101202 (renewal), and 101203 (configuration change)
Domain name package - CLB: 101207 (new purchase), 101208 (renewal), and 101209 (configuration change)
Business expansion package - CLB: 101210 (new purchase), 101211 (renewal), and 101212 (configuration adjustment)

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGoodsCategoryId(Long GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * Get Region ID for purchasing WAF instance

1 indicates purchasing resources in Chinese mainland.
9 indicates purchasing resources outside Chinese mainland.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID for purchasing WAF instance

1 indicates purchasing resources in Chinese mainland.
9 indicates purchasing resources outside Chinese mainland.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID for purchasing WAF instance

1 indicates purchasing resources in Chinese mainland.
9 indicates purchasing resources outside Chinese mainland.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID for purchasing WAF instance

1 indicates purchasing resources in Chinese mainland.
9 indicates purchasing resources outside Chinese mainland.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public GoodNews() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodNews(GoodNews source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.GoodsDetail != null) {
            this.GoodsDetail = new GoodsDetailNew(source.GoodsDetail);
        }
        if (source.GoodsCategoryId != null) {
            this.GoodsCategoryId = new Long(source.GoodsCategoryId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamObj(map, prefix + "GoodsDetail.", this.GoodsDetail);
        this.setParamSimple(map, prefix + "GoodsCategoryId", this.GoodsCategoryId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

