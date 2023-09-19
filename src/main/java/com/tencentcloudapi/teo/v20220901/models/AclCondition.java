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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclCondition extends AbstractModel{

    /**
    * Filters: 
<li>`host`: Request domain name;</li>
<li>`sip`: Client IP;</li>
<li>`ua`: User-Agent;</li>
<li>`cookie`: Cookie;</li>
<li>`cgi`: CGI script;</li>
<li>`xff`: XFF header;</li></li>
<li>`url`: Request URL;<li></li>
<li>`accept`: Request content type;</li>
<li>`method`: Request method<;/li>
<li>`header`: Request header;</li>
<li>`app_proto`: Application layer protocol;</li>
<li>`sip_proto`: Network layer protocol;</li>
<li>`uabot`: UA rules (only available in custom bot rules);</li>
<li>`idcid`: IDC rules (only available in custom bot rules);</li>
<li>`sipbot`: Search engine rules (only available in custom bot rules);</li>
<li>`portrait`: Client reputation (only available in custom bot rules);</li>
<li>`header_seq`: Header sequence (only available in custom bot rules);</li>
<li>`hdr`: Request body (only available in custom Web protection rules). </li>
    */
    @SerializedName("MatchFrom")
    @Expose
    private String MatchFrom;

    /**
    * The parameter of the field. When `MatchFrom = header`, the key contained in the header can be passed.
    */
    @SerializedName("MatchParam")
    @Expose
    private String MatchParam;

    /**
    * The logical operator. Values:
<li>`equal`: Value equals</li>
<li>`not_equal`: Value not equals</li>
<li>`include`: String contains</li>
<li>`not_include`: String not contains</li>
<li>`match`: IP matches</li>
<li>`not_match`: IP not matches</li>
<li>`include_area`: Regions contain</li>
<li>`is_empty`: Value left empty</li>
<li>`not_exists`: Key fields not exist</li>
<li>`regexp`: Regex matches</li>
<li>`len_gt`: Value greater than</li>
<li>`len_lt`: Value smaller than</li>
<li>`len_eq`: Value equals</li>
<li>`match_prefix`: Prefix matches</li>
<li>`match_suffix`: Suffix matches</li>
<li>`wildcard`: Wildcard</li>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * The content to match.
    */
    @SerializedName("MatchContent")
    @Expose
    private String MatchContent;

    /**
     * Get Filters: 
<li>`host`: Request domain name;</li>
<li>`sip`: Client IP;</li>
<li>`ua`: User-Agent;</li>
<li>`cookie`: Cookie;</li>
<li>`cgi`: CGI script;</li>
<li>`xff`: XFF header;</li></li>
<li>`url`: Request URL;<li></li>
<li>`accept`: Request content type;</li>
<li>`method`: Request method<;/li>
<li>`header`: Request header;</li>
<li>`app_proto`: Application layer protocol;</li>
<li>`sip_proto`: Network layer protocol;</li>
<li>`uabot`: UA rules (only available in custom bot rules);</li>
<li>`idcid`: IDC rules (only available in custom bot rules);</li>
<li>`sipbot`: Search engine rules (only available in custom bot rules);</li>
<li>`portrait`: Client reputation (only available in custom bot rules);</li>
<li>`header_seq`: Header sequence (only available in custom bot rules);</li>
<li>`hdr`: Request body (only available in custom Web protection rules). </li> 
     * @return MatchFrom Filters: 
<li>`host`: Request domain name;</li>
<li>`sip`: Client IP;</li>
<li>`ua`: User-Agent;</li>
<li>`cookie`: Cookie;</li>
<li>`cgi`: CGI script;</li>
<li>`xff`: XFF header;</li></li>
<li>`url`: Request URL;<li></li>
<li>`accept`: Request content type;</li>
<li>`method`: Request method<;/li>
<li>`header`: Request header;</li>
<li>`app_proto`: Application layer protocol;</li>
<li>`sip_proto`: Network layer protocol;</li>
<li>`uabot`: UA rules (only available in custom bot rules);</li>
<li>`idcid`: IDC rules (only available in custom bot rules);</li>
<li>`sipbot`: Search engine rules (only available in custom bot rules);</li>
<li>`portrait`: Client reputation (only available in custom bot rules);</li>
<li>`header_seq`: Header sequence (only available in custom bot rules);</li>
<li>`hdr`: Request body (only available in custom Web protection rules). </li>
     */
    public String getMatchFrom() {
        return this.MatchFrom;
    }

    /**
     * Set Filters: 
<li>`host`: Request domain name;</li>
<li>`sip`: Client IP;</li>
<li>`ua`: User-Agent;</li>
<li>`cookie`: Cookie;</li>
<li>`cgi`: CGI script;</li>
<li>`xff`: XFF header;</li></li>
<li>`url`: Request URL;<li></li>
<li>`accept`: Request content type;</li>
<li>`method`: Request method<;/li>
<li>`header`: Request header;</li>
<li>`app_proto`: Application layer protocol;</li>
<li>`sip_proto`: Network layer protocol;</li>
<li>`uabot`: UA rules (only available in custom bot rules);</li>
<li>`idcid`: IDC rules (only available in custom bot rules);</li>
<li>`sipbot`: Search engine rules (only available in custom bot rules);</li>
<li>`portrait`: Client reputation (only available in custom bot rules);</li>
<li>`header_seq`: Header sequence (only available in custom bot rules);</li>
<li>`hdr`: Request body (only available in custom Web protection rules). </li>
     * @param MatchFrom Filters: 
<li>`host`: Request domain name;</li>
<li>`sip`: Client IP;</li>
<li>`ua`: User-Agent;</li>
<li>`cookie`: Cookie;</li>
<li>`cgi`: CGI script;</li>
<li>`xff`: XFF header;</li></li>
<li>`url`: Request URL;<li></li>
<li>`accept`: Request content type;</li>
<li>`method`: Request method<;/li>
<li>`header`: Request header;</li>
<li>`app_proto`: Application layer protocol;</li>
<li>`sip_proto`: Network layer protocol;</li>
<li>`uabot`: UA rules (only available in custom bot rules);</li>
<li>`idcid`: IDC rules (only available in custom bot rules);</li>
<li>`sipbot`: Search engine rules (only available in custom bot rules);</li>
<li>`portrait`: Client reputation (only available in custom bot rules);</li>
<li>`header_seq`: Header sequence (only available in custom bot rules);</li>
<li>`hdr`: Request body (only available in custom Web protection rules). </li>
     */
    public void setMatchFrom(String MatchFrom) {
        this.MatchFrom = MatchFrom;
    }

    /**
     * Get The parameter of the field. When `MatchFrom = header`, the key contained in the header can be passed. 
     * @return MatchParam The parameter of the field. When `MatchFrom = header`, the key contained in the header can be passed.
     */
    public String getMatchParam() {
        return this.MatchParam;
    }

    /**
     * Set The parameter of the field. When `MatchFrom = header`, the key contained in the header can be passed.
     * @param MatchParam The parameter of the field. When `MatchFrom = header`, the key contained in the header can be passed.
     */
    public void setMatchParam(String MatchParam) {
        this.MatchParam = MatchParam;
    }

    /**
     * Get The logical operator. Values:
<li>`equal`: Value equals</li>
<li>`not_equal`: Value not equals</li>
<li>`include`: String contains</li>
<li>`not_include`: String not contains</li>
<li>`match`: IP matches</li>
<li>`not_match`: IP not matches</li>
<li>`include_area`: Regions contain</li>
<li>`is_empty`: Value left empty</li>
<li>`not_exists`: Key fields not exist</li>
<li>`regexp`: Regex matches</li>
<li>`len_gt`: Value greater than</li>
<li>`len_lt`: Value smaller than</li>
<li>`len_eq`: Value equals</li>
<li>`match_prefix`: Prefix matches</li>
<li>`match_suffix`: Suffix matches</li>
<li>`wildcard`: Wildcard</li> 
     * @return Operator The logical operator. Values:
<li>`equal`: Value equals</li>
<li>`not_equal`: Value not equals</li>
<li>`include`: String contains</li>
<li>`not_include`: String not contains</li>
<li>`match`: IP matches</li>
<li>`not_match`: IP not matches</li>
<li>`include_area`: Regions contain</li>
<li>`is_empty`: Value left empty</li>
<li>`not_exists`: Key fields not exist</li>
<li>`regexp`: Regex matches</li>
<li>`len_gt`: Value greater than</li>
<li>`len_lt`: Value smaller than</li>
<li>`len_eq`: Value equals</li>
<li>`match_prefix`: Prefix matches</li>
<li>`match_suffix`: Suffix matches</li>
<li>`wildcard`: Wildcard</li>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set The logical operator. Values:
<li>`equal`: Value equals</li>
<li>`not_equal`: Value not equals</li>
<li>`include`: String contains</li>
<li>`not_include`: String not contains</li>
<li>`match`: IP matches</li>
<li>`not_match`: IP not matches</li>
<li>`include_area`: Regions contain</li>
<li>`is_empty`: Value left empty</li>
<li>`not_exists`: Key fields not exist</li>
<li>`regexp`: Regex matches</li>
<li>`len_gt`: Value greater than</li>
<li>`len_lt`: Value smaller than</li>
<li>`len_eq`: Value equals</li>
<li>`match_prefix`: Prefix matches</li>
<li>`match_suffix`: Suffix matches</li>
<li>`wildcard`: Wildcard</li>
     * @param Operator The logical operator. Values:
<li>`equal`: Value equals</li>
<li>`not_equal`: Value not equals</li>
<li>`include`: String contains</li>
<li>`not_include`: String not contains</li>
<li>`match`: IP matches</li>
<li>`not_match`: IP not matches</li>
<li>`include_area`: Regions contain</li>
<li>`is_empty`: Value left empty</li>
<li>`not_exists`: Key fields not exist</li>
<li>`regexp`: Regex matches</li>
<li>`len_gt`: Value greater than</li>
<li>`len_lt`: Value smaller than</li>
<li>`len_eq`: Value equals</li>
<li>`match_prefix`: Prefix matches</li>
<li>`match_suffix`: Suffix matches</li>
<li>`wildcard`: Wildcard</li>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get The content to match. 
     * @return MatchContent The content to match.
     */
    public String getMatchContent() {
        return this.MatchContent;
    }

    /**
     * Set The content to match.
     * @param MatchContent The content to match.
     */
    public void setMatchContent(String MatchContent) {
        this.MatchContent = MatchContent;
    }

    public AclCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclCondition(AclCondition source) {
        if (source.MatchFrom != null) {
            this.MatchFrom = new String(source.MatchFrom);
        }
        if (source.MatchParam != null) {
            this.MatchParam = new String(source.MatchParam);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.MatchContent != null) {
            this.MatchContent = new String(source.MatchContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchFrom", this.MatchFrom);
        this.setParamSimple(map, prefix + "MatchParam", this.MatchParam);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "MatchContent", this.MatchContent);

    }
}

