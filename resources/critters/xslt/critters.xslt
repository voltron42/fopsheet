<?xml version="1.0"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:xlink="http://www.w3.org/1999/xlink">
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="first"
                                       margin-right=".25in"
                                       margin-left=".25in"
                                       margin-bottom=".25in"
                                       margin-top=".25in"
                                       page-width="4in"
                                       page-height="6in">
                    <fo:region-body margin-top="0"/>
                    <fo:region-before extent="0"/>
                    <fo:region-after extent="0"/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <xsl:apply-templates select="compendium/monster"/>
        </fo:root>
    </xsl:template>

    <xsl:template match="monster">
        <fo:page-sequence master-reference="first">
            <fo:flow flow-name="xsl-region-body">
                <fo:block font-size="12pt" font-weight="bold" space-after=".05in"><xsl:value-of select="name"/></fo:block>
                <fo:block font-size="8pt" font-weight="bold" space-after=".05in"><xsl:value-of select="type"/>, <xsl:value-of select="alignment"/></fo:block>
                <fo:block font-size="8pt">
                    <fo:table table-layout="fixed" width="100%" border-collapse="separate">
                        <fo:table-column column-width="0.4in"/>
                        <fo:table-column column-width="0.1in"/>
                        <fo:table-column column-width="0.7in"/>
                        <fo:table-column column-width="0.5in"/>
                        <fo:table-column column-width="0.4in"/>
                        <fo:table-column column-width="0.1in"/>
                        <fo:table-column column-width="1.2in"/>
                        <fo:table-body>
                            <fo:table-row>
                                <fo:table-cell><fo:block text-align="right">STR </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="str"/> (<xsl:value-of select="(str - 10) div 2"/>)</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block text-align="right">AC </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="ac"/></fo:block></fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell><fo:block text-align="right">DEX </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="dex"/> (<xsl:value-of select="(dex - 10) div 2"/>)</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block text-align="right">HP </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="hp"/></fo:block></fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell><fo:block text-align="right">CON </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="con"/> (<xsl:value-of select="(con - 10) div 2"/>)</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block text-align="right">SPD </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="speed"/></fo:block></fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell><fo:block text-align="right">INT </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="int"/> (<xsl:value-of select="(int - 10) div 2"/>)</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block text-align="right">Size </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="size"/></fo:block></fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell><fo:block text-align="right">WIS </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="wis"/> (<xsl:value-of select="(wis - 10) div 2"/>)</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block text-align="right">PP </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="passive"/></fo:block></fo:table-cell>
                            </fo:table-row>
                            <fo:table-row>
                                <fo:table-cell><fo:block text-align="right">CHA </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="cha"/> (<xsl:value-of select="(cha - 10) div 2"/>)</fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block text-align="right">CR </fo:block></fo:table-cell>
                                <fo:table-cell><fo:block></fo:block></fo:table-cell>
                                <fo:table-cell><fo:block><xsl:value-of select="cr"/></fo:block></fo:table-cell>
                            </fo:table-row>
                        </fo:table-body>
                    </fo:table>
                </fo:block>
                <xsl:apply-templates select="skill"/>
                <xsl:apply-templates select="senses"/>
                <xsl:apply-templates select="trait"/>
                <xsl:apply-templates select="action"/>
                <xsl:apply-templates select="legendary"/>
                <xsl:apply-templates select="description"/>
            </fo:flow>
        </fo:page-sequence>
    </xsl:template>

    <xsl:template match="trait">
        <xsl:call-template name="hr"/>
        <xsl:apply-templates select="name"/>
        <xsl:apply-templates select="text"/>
    </xsl:template>

    <xsl:template match="action">
        <xsl:call-template name="hr"/>
        <xsl:apply-templates select="name"/>
        <xsl:apply-templates select="text"/>
    </xsl:template>

    <xsl:template match="legendary">
        <xsl:call-template name="hr"/>
        <xsl:apply-templates select="name"/>
        <xsl:apply-templates select="text"/>
    </xsl:template>

    <xsl:template match="name">
        <xsl:call-template name="header">
            <xsl:with-param name="text"><xsl:value-of select="."/></xsl:with-param>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="text">
        <xsl:call-template name="paragraph">
            <xsl:with-param name="body"><xsl:value-of select="."/></xsl:with-param>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="skill">
        <xsl:call-template name="hr"/>
        <xsl:call-template name="paragraph">
            <xsl:with-param name="body"><xsl:value-of select="."/></xsl:with-param>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="senses">
        <xsl:call-template name="hr"/>
        <xsl:call-template name="paragraph">
            <xsl:with-param name="body"><xsl:value-of select="."/></xsl:with-param>
        </xsl:call-template>
    </xsl:template>

    <xsl:template match="description">
        <xsl:call-template name="hr"/>
        <xsl:call-template name="paragraph">
            <xsl:with-param name="body"><xsl:value-of select="."/></xsl:with-param>
        </xsl:call-template>
    </xsl:template>

    <xsl:template name="hr">
        <fo:block border-bottom-width="1pt" border-bottom-style="solid" border-bottom-color="black" font-weight="bold" text-align="center" space-after=".1in" space-before=".1in"> </fo:block>
    </xsl:template>

    <xsl:template name="paragraph">
        <xsl:param name="body"/>
        <fo:block font-size="9pt"><xsl:value-of select="$body"/></fo:block>
    </xsl:template>

    <xsl:template name="header">
        <xsl:param name="text"/>
        <fo:block font-size="10pt" font-weight="bold" space-after="0.05in"><xsl:value-of select="$text"/></fo:block>
    </xsl:template>
</xsl:stylesheet>