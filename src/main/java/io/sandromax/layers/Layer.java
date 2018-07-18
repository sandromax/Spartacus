//package io.sandromax.layers;
//
//
//import java.util.List;
//
///**
// * Позволяет разделять стройку на слои, в которых размещаються области
// *
// */
//public class Layer {
//    private int level;
//    private Layer parent;
//
//    public Layer() {
//    }
//
//    private Layer(int level, Layer parent) {
//        this.level = level;
//        this.parent = parent;
//    }
//
//    public static Layer createNewLayer(int level, Layer parentLayer, List<Layer> listLayer) {
//        Layer newLayer = new Layer(level, parentLayer);
//
//        if(!hasSameLayer(newLayer, listLayer)) {
//            return newLayer;
//        }
//
//        return null;
//    }
//
//    private static boolean hasSameLayer(Layer newLayer, List<Layer> layerList) {
//        for(Layer layerInList : layerList) {
//            if(newLayer.level == layerInList.level & newLayer.parent.equals(layerInList.parent)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
//}
