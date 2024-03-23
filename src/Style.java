public class Style {
    public final String fillColor, strokeColor;
    public final double strokeWidth;
    public Style(){
        this.fillColor = null;
        this.strokeColor = null;
        this.strokeWidth = 0;
    }

    public Style(String fillColor, String strokeColor, double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg(){
        StringBuilder style = new StringBuilder();
        style.append("style=\"fill:").append(fillColor).append(";stroke:").append(strokeColor).append(");stroke-width:3\" />");
        return style.toString();
    }

}